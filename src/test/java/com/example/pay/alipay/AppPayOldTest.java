package com.example.pay.alipay;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.pay.alipay.common.AliPayConfig;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fanyouxiang
 * @version 1.0.0
 * @name AppPayOldTest
 * @date 2020/6/29 14:17
 * @describe
 */
public class AppPayOldTest {

    @Test
    public void pay() throws AlipayApiException, UnsupportedEncodingException {
        AlipayClient alipayClient = new DefaultAlipayClient(
                AliPayConfig.gatewayUrl,
                AliPayConfig.app_id,
                AliPayConfig.merchant_private_key,
                "json",
                AliPayConfig.charset,
                AliPayConfig.alipay_public_key,
                AliPayConfig.sign_type);

        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
//        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        /**
         *
         * SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)
         *
         */
        Map<String, Object> paramMapSend = new HashMap<String, Object>();
        paramMapSend.put("total_amount", "10");
        paramMapSend.put("body", "杨鑫的测试商品1");
        paramMapSend.put("subject", "实体商品-袜子11");
        paramMapSend.put("out_trade_no", "135792468011");
        paramMapSend.put("timeout_express","9m");//订单失效时间
//        Map<String, String> merchantMap = new HashMap<String, String>();
//        merchantMap.put("merchant_id", "2088102180986401");//受理商户编号
//        paramMapSend.put("sub_merchant", merchantMap);
        request.setBizContent(JSON.toJSONString(paramMapSend));
        System.out.println("request:"+JSON.toJSONString(request));
        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
        if(response.isSuccess()){
            System.out.println("outTradeNo:"+response.getOutTradeNo());
            System.out.println("merchantOrderNo:"+response.getMerchantOrderNo());
            System.out.println("sellerId:"+response.getSellerId());
            System.out.println("totalAmount:"+response.getTotalAmount());
            System.out.println("tradeNo:"+response.getTradeNo());
            System.out.println("msg:"+response.getMsg());
            System.out.println("code:"+response.getCode());
            System.out.println("body:"+response.getBody());
            System.out.println("body:"+ URLDecoder.decode(response.getBody(),"utf-8"));
        } else {
            System.out.println("调用失败");
        }
        System.out.println("=======================================结束");
    }
}
