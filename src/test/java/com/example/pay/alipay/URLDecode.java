package com.example.pay.alipay;

import java.net.URLDecoder;

/**
 * @class: URLDecode
 * @desc:
 * @author: yx
 * @date: 2020/7/1 16:16
 */
public class URLDecode {
    public static void main(String[] args) {
        String data = "";
        String data1 = "alipay_sdk=alipay-sdk-java-4.10.29.ALL&app_id=2016102500756468&biz_content=%7B%22body%22%3A%22%E6%88%91%E6%98%AF%E7%94%9F%E6%88%90%E4%BA%8C%E7%BB%B4%E7%A0%81%E6%B5%8B%E8%AF%95%E6%95%B0%E6%8D%AE%22%2C%22out_trade_no%22%3A%222479620200702%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22subject%22%3A%22App%E6%94%AF%E4%BB%98%E6%B5%8B%E8%AF%95Java%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A%220.01%22%7D&charset=utf-8&format=json&method=alipay.trade.app.pay&sign=BU41ASQ7mJgryRXwaJ8YW08vVVcZNlBDFp29ovZjCzEM%2FcQd003LUkHSEwfFmHr6du8lwv2cX9%2F2RvnXP%2BWGqdzKRw7CW%2FIsxYsyOVowmOT3Vvs4vYik1Ipvko%2B9Tgk3Iqp60to%2BS5nVFMdWGa3t3aObKQU5M70gqFFICUcQlMy90CC%2BDIn2yWAa3Lz3%2B%2FzJVpHQ%2Fw%2BImd7lX6BtYcUyVT54T1XOaDzZdH6vI3y8HWa9eeLOIbjaDb4QqsoJo4LAyr%2F%2FXkIGg9sCtDXncU8mPkrUsrTI0mQcwSB228wCFmdZfz%2Bfe8uXaAD60cbPMNbjgDEpct5ItT86oJMOqRdB0Q%3D%3D&sign_type=RSA2&timestamp=2020-07-02+09%3A13%3A23&version=1.0";

        System.out.println(URLDecoder.decode(data));
        System.out.println(URLDecoder.decode(data1));
    }
}
