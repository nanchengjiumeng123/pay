//package com.example.pay.weixin;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @class: WxPay
// * @desc: 微信支付----V2版本！！！！
// * @author: yx
// * @date: 2020/7/3 17:25
// */
//@RestController
//public class WxPay {
//
//    @RequestMapping("/pay/payparm")
//    public void payparm(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            // 获取openid
//            String openId = (String) request.getSession().getAttribute("openId");
//            if (openId == null) {
//                openId = getUserOpenId(request);
//            }
//           String appid = WXConfig.APP_ID;
//           String paternerKey = WXConfig.PERTNER_KEY;
//           String out_trade_no = getTradeNo();
//           Map<String, String> paraMap = new HashMap<String, String>();
//           paraMap.put("appid", appid);
//           paraMap.put("attach", "测试");
//           paraMap.put("body", "测试购买支付");
//           paraMap.put("mch_id", WXConfig.PARTNER);
//           paraMap.put("nonce_str", create_nonce_str());
//           paraMap.put("openid", openId);
//           paraMap.put("out_trade_no", out_trade_no);
//           paraMap.put("spbill_create_ip", getAddrIp(request));
//           paraMap.put("total_fee", "1");
//           paraMap.put("trade_type", "JSAPI");
//          paraMap.put("notify_url", "http://m.ebiaotong.com/WXPay/notify");// 此路径是微信服务器调用支付结果通知路径
//          String sign = getSign(paraMap, paternerKey);
//          paraMap.put("sign", sign);
//          // 统一下单 https://api.mch.weixin.qq.com/pay/unifiedorder
//          String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
//
//          String xml = ArrayToXml(paraMap);
//
//          String xmlStr = HttpKit.post(url, xml);
//
//          // 预付商品id
//          String prepay_id = "";
//
//          if (xmlStr.indexOf("SUCCESS") != -1) {
//          Map<String, String> map = doXMLParse(xmlStr);
//          prepay_id = (String) map.get("prepay_id");
//          }
//
//           String timeStamp = create_timestamp();//时间戳
//           String nonceStr = create_nonce_str();//随机字符串
//           Map<String, String> payMap = new HashMap<String, String>();
//           payMap.put("appId", appid);
//           payMap.put("timeStamp", timeStamp);
//           payMap.put("nonceStr", nonceStr);
//           payMap.put("signType", "MD5");
//           payMap.put("package", "prepay_id=" + prepay_id);
//           //paySign
//           String paySign = getSign(payMap, paternerKey);
//
//           payMap.put("pg", prepay_id);
//           payMap.put("paySign", paySign);
//
//           // 拼接并返回json
//           StringBuilder sBuilder = new StringBuilder("[{");
//           sBuilder.append("appId:'").append(appid).append("',")
//                   .append("timeStamp:'").append(timeStamp).append("',")
//                   .append("nonceStr:'").append(nonceStr).append("',")
//                   .append("pg:'").append(prepay_id).append("',")
//                   .append("signType:'MD5',")
//                   .append("paySign:'").append(paySign).append("'");
//                   sBuilder.append("}]");
//                   response.getWriter().print(sBuilder.toString());
//                   response.getWriter().close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
