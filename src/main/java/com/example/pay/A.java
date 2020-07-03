package com.example.pay;

import java.util.Date;

/**
 * @class: A
 * @desc:
 * @author: yx
 * @date: 2020/7/3 10:59
 */
public class A {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        long timeStamp = d.getTime() / 1000;     //getTime()得到的是微秒， 需要换算成秒
        System.out.println(timeStamp);

        long l = System.currentTimeMillis();
        System.out.println(l);
    }

}
