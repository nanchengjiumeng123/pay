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
        String appid = "wxd04e2ca96fc2b191";
        String partnerid = "1473197202";
        String prepayid = "wx01154558009196a044078c8d1320207300";
        String package1 = "Sign=WXPay";
        String noncestr = "54fee33d861642d5b8bbcdcbc0890875";
        String timestamp = String.valueOf(new Date().getTime() / 1000);




    }
}
