package com.daily.code.dailycode.memleak;

/**
 * 内存泄露
 */
public class LeakDemo {
    private String[] strings;
    private int topIndex = -1;

    public LeakDemo(int n) {
        strings = new String[n];
    }

    public boolean push(String s) {
        if (strings.length > topIndex) {
            strings[++topIndex] = s;
            return true;
        }else {
            return false;
        }
    }

    public String pop() {
        if (topIndex >= 0) {
            String tmp = strings[topIndex];
            // strings[topIndex] = null;
            return tmp;
        }else {
            return null;
        }
    }

}
