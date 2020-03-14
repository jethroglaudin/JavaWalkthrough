package com.jethro;

public class Main {

    public static void main(String[] args) {
       int result = Math.round(1.1F);
       System.out.println(result);
       int result2 = (int)Math.ceil(1.1F);
       System.out.println(result2);
       int result3 = (int)Math.floor(1.1F);
       System.out.println(result3);
       int result4 = Math.max(1, 3);
       System.out.println(result4);
       double result5 = Math.random() * 100;
       System.out.println(result5);
       int result6 = (int) (Math.random() * 100);
       System.out.println(result6);
    }
}
