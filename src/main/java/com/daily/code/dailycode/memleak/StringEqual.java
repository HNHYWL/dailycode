package com.daily.code.dailycode.memleak;

import java.util.Arrays;

public class StringEqual {

    public static boolean equal(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < s1.length(); i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int  show() {
        try{
            String s1 = "aba";
            String s2 = "aab";
            int i = 0xFFFFFFFF;
            byte b = 0x7F;
            char c = '\u0571';
            byte bb = 01;
            int ii = 'a';
            long l = 455555666666L;
            System.out.println(Long.MAX_VALUE);
            return 5;
        }catch (Exception e){
            System.out.println("kkk");
        }finally {
            System.out.println("finally");
            return 4;
        }
    }


    public static void main(String[] args) {
        try{
            String s1 = "aba";
            String s2 = "aab";
            int i = 0xFFFFFFFF;
            byte b = 0x7F;
            char c = '\u0571';
            byte bb = 01;
            int ii = 'a';
            long l = 455555666666L;
            System.out.println(Long.MAX_VALUE);
        }finally {
            System.out.println("finally");
        }

        System.out.println(show());







    }

}
