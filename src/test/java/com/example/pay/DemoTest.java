package com.example.pay;

import sun.net.www.http.HttpClient;

/**
 * @class: DemoTest
 * @desc:
 * @author: yx
 * @date: 2020/7/3 17:57
 */
public class DemoTest {
    public static void main(String[] args) {
         String USER_AGENT =   " (" + System.getProperty("os.arch") + " " + System.getProperty("os.name") + " " + System.getProperty("os.version") +
                ") Java/" + System.getProperty("java.version") + " HttpClient/" + HttpClient.class.getPackage().getImplementationVersion();
        System.out.println(USER_AGENT);

    }
}
