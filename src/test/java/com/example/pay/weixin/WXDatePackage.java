package com.example.pay.weixin;

import java.util.Date;

/**
 * @class: DatePackage
 * @desc:
 * @author: yx
 * @date: 2020/7/3 14:00
 */
public class WXDatePackage {
    public static void main(String[] args) {
        String timestamp = String.valueOf(new Date().getTime() / 1000);
        System.out.println(timestamp);
    }
}
