package com.example.pay.common;

/**
 * @author fanyouxiang
 * @version 1.0.0
 * @name AliPayConfig
 * @date 2020/6/29 13:47
 * @describe
 */
public class AliPayConfig {

    // [沙箱环境]应用ID,您的APPID，收款账号既是你的APPID对应支付宝账号
    public static String app_id = "2016102500756866";
    // [沙箱环境]商户私钥，你的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC37kduXtX5PGMUwfzShX/Ybct5qMVaBsBwNNxnR+hKzKU5mur46q5WF9aBXVEypIwaFn5cKWIEULuIhUJZUmtNQjbkX6XTcJ8Z6mDt+9Fxy4yxINmDHpVk7aLSaL63PN62cuGrZsuUVhEzkGTCn/mAmn+WxBP4wedLqLf1kxKzOpNaHlLxB1TzXPCzSp9GddSwA07mUsNPz7DrEVvkFuG6NVLIHnVw92cVGIdqgwLYg0BEjBei8I5Is0PdqSAUSxfPNmlTvc8ar891esJYpZFDm2aLBaSEYE616qVgm3qI85B7JSE2mEsI+UTeBCeHsUA2GleQWzYJEIUsQqZncCgpAgMBAAECggEAfQzOmdZ2ac5JmtpM1qCXDAGR3nQFQTDn8yGtW7bC0uAR0XlnGbcMslHgr/FO/DxtWGtEm8oy7rYo2ientWzYsR08jsYMyxV9xjPYlNSpUFHQpLityXyom4cJNT6rs4756Fdw4ISyEnb1mPYp2zzCeFISPuGupmjGpWTfNWI5y4n3Qfn9dY0Bzd0umg0V0elub/MGMX/+AaHVpJKvTAlUaP/N0Jd5CiznZklrVNGLqdsOBkWcpk+Rm7RsH5kFohxH7IQ3YCiWV8AcgPDEsOqcCp7ewrGbUovXPLdRctbjndagPAIFoKH2w0xZDLLReUvQjYXi+XVM1TXL7aRhYRSbNQKBgQDidunZcg7V4eIX/xKYHBh6BxohEsOOF7rXbfE8IuYhS5ZU9gdDO/7beEssScf5du/aHN0FpOf8Nnx3s7D84/noNCixfRKziEb0fXkWv/Ksf/GSl6J8Vv3SN5KY2ltlbtNcsApbo/RXeRA/kfkhn/FWLbkFgVhMsyvVet7lFvGc2wKBgQDP60UpoZEt/T6V5nniES/I8/j2ACeOm+L10q9Rkb2sazfxMhV8cK2L9MWULcYDcCRhYmkCvoz9/3MBTDkK34xP61QFIruMXVkGcb1TFXoMYjQukgpB6/jJ28pdfQblNaUlVwWkYKnB/qFSO+2GYmVoMHsab1l4glqNq+4B/QHcSwKBgCl6A/xqUmND2qfwdJRdWPJIiLWT/TLyD6tTHIKaFbH1aRQod04OF/BUSNhUrwZ2jRlSffyBpmdgB03ZIEpA6s1neCiBssIk7HHs5ReQkj6btD/X+89wE07EFNpf66tZL+bi6xK7pY27w4kRECLja00QVLm4ZdauXhHcTiSBHkFPAoGBAIN/sCFxXumwNioGN2XkKs20h+vGEz6dlwCUPG+hdk2bDimM3Iv0k75lk6RxAsBf55Jz9ChZLcDjE/BpLdaTpiFRm7UXz3gp/ckWnH/0oFk+rvQZR0WEIbhBOw6/qWHD+OvRyu64eAUKryrcXhBVIP+xUdpZPEP8ZZsedwxo4QlbAoGBAKtqPZs3dqR5I/Jadjnu/WZSmhwfGkgRklX/5GDkw9CaJp2be9LbqAWGwUQHPEEnYAcV+zaCr0Zau9CdBP+M/5DcG3N5gva5YqxiThuLqB5AqBh6gDj9KmSzVk/0Oo05h2AkHCUkWzil0nSnSOmtiDYhNfN8z+zbJwFLRHWtVYW2";
    // [沙箱环境]支付宝公钥
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1xWL9nS8BMGrEEtCoVXQu8HYGUk6AZR1cuWVVFKwyC+aTb6afWWvrlAV3jrMmkwM/pAwHGkRZ6P2HZ2a5cb78r10QXaErW39URiJdnV0cZ6QKErNFqCKBmv3GBxxFVQTs7Vg83jhXVE3iKXrQeBj3yqSlz+YDiveQCUFFUeXTYm02DslOEnsCda0s2JOb+gKebI1MVqgPrwx1u/I43hSMaTuj6M8gzpGNIwdVqI8kRcQeNYuHT/JbDl8GNQm4xxPS5eOpOJubJ9i1x2haXmMA3NejuXqEpk7fvkQzgsxtR7Ifjujc7oPyC6dhqC8CVa23eDGWsz05boiEMyuI+A1MQIDAQAB";
    // [沙箱环境]服务器异步通知页面路径
    public static String notify_url="http://ngrok.sscai.club/alipay/aliPayNotify_url";

    // [沙箱环境]页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url ="《支付成功跳转页面》";

    // [沙箱环境]
    public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";
}
