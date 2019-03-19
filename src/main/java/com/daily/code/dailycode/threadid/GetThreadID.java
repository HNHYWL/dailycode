package com.daily.code.dailycode.threadid;

/**
 * 获取java线程id
 */

class GetThreadID {
    // 声明native方法
    public static native int get_tid();

    static {
        // 加载动态库文件，native方法就在这里面实现的
        System.loadLibrary("GetThreadID");
    }
    // 搞了两个死循环，等下可看到两个cpu占用率为100%的线程
    public static void main(String[] args) {
        int tid = GetThreadID.get_tid();
        System.out.println("main TID=" + tid);

        new Thread(){
            @Override
            public void run() {
                int tid = GetThreadID.get_tid();
                System.out.println("TID=" + tid);
                while (true){}
            }
        }.start();

        while (true){}
    }
}

/*
#include <jni.h>
#include <syscall.h>
#include "GetThreadID.h"
JNIEXPORT jint JNICALL
Java_GetThreadID_get_1tid(JNIEnv *env, jobject obj) {
	// 这里发起系统调用，读取上述task_struct结构体里的pid，估计实现就一行：return current->pid // current为指向当前线程(task_struct)的指针;
	// 感觉系统调用的过程一定要好好研究下，
	// __NR_gettid: 系统调用号码宏定义，查看系统文件/usr/include/asm/unistd_64.h文件可知其为186，即下面的代码等价于：syscall(186)
    jint tid = syscall(__NR_gettid);
    return tid;
}

gcc -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux -fPIC -shared GetThreadID.c -o libGetThreadID.so

* */
