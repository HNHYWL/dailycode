package com.daily.code.dailycode.redisid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import sun.nio.ch.DirectBuffer;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


@Configuration
public class IDByRedis {
    private volatile String idPrefix;
    private String HOST;
    private int PORT;
    private CountDownLatch countDownLatch = new CountDownLatch(1);
    private AtomicInteger subfix = new AtomicInteger(0);

    public IDByRedis(String host, int port) throws InterruptedException {
        this.HOST = host;
        this.PORT = port;
        start();
        countDownLatch.await();
    }

    private void start() {
        Jedis jedis = new Jedis(HOST, PORT);
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new UpdatePrfix(jedis), 0, 1, TimeUnit.SECONDS);
        //service.shutdown();
    }

    public String getID() {
        return String.format("%s%07d", idPrefix, subfix.incrementAndGet());
    }

    private class UpdatePrfix implements Runnable{
        private Jedis jedis;

        public UpdatePrfix(Jedis jedis) {
            this.jedis = jedis;
        }

        @Override
        public void run() {
            Long nowTime = System.currentTimeMillis()/1000;
            String nowString = nowTime.toString();
            long incrResult = jedis.incr(nowString);
            idPrefix = String.format("%s%03d", nowString, incrResult);
            if (countDownLatch.getCount() != 0) {
                countDownLatch.countDown();
            }

        }
    }


    @Bean
    public IDByRedis IdByRedis() throws InterruptedException {
        return new IDByRedis("localhost", 6379);
    }

    static final int tableSizeFor(int cap) {
        int MAXIMUM_CAPACITY = 1<<30;
        // 101 5
        int n = cap - 1;
        // 100
        //  10
        // 110
        // 2 4 8 16 32
        n |= n >>> 1;
        System.out.println(n);
        //   1
        //111
        n |= n >>> 2;
        System.out.println(n);

        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        int i = (n < 0) ? 1 : (n + 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    public static void main(String[] args) throws InterruptedException {
        int a = 89;
        String  b=(a>89)?"A":(a>60)?"B":"C";//三目运算符里的嵌套
        int i = tableSizeFor(5);
        System.out.println(i);

        System.out.println(b+" ");
        IDByRedis localhost = new IDByRedis("localhost", 6379);
        System.out.println(localhost.getID());
        System.out.println(localhost.getID());
        Set<Integer> set = new HashSet<>();
        // int i = 0;
        // while (i++ < 10000) {
        //     set.add(localhost.getID().length());
        // }
        // System.out.println(set.size());
        // set.stream().forEach(k -> System.out.println(k));
       //
       // ByteBuffer.allocateDirect(1024 * 1024 * 15);
       //  WeakHashMap
        DirectBuffer directBuffer = (DirectBuffer) ByteBuffer.allocateDirect(9);
        directBuffer.cleaner().clean();

    }
}

