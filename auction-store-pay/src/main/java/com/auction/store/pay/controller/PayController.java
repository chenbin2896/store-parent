package com.auction.store.pay.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.auction.store.pay.config.AlipayConfig;
import com.auction.store.pay.pojo.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * @author User
 * @date 2019/10/2
 * @description
 */
@RestController
@Api(tags = "支付中心")
@RequestMapping("/v1/pay")
public class PayController {


    @ApiOperation("订单支付")
    @GetMapping("create/{WIDout_trade_no}/{WIDtotal_amount}/{WIDsubject}/{WIDbody}")
    public String pay(@ApiParam(value = "商户订单号", required = true) @PathVariable("WIDout_trade_no") String WIDout_trade_no,
                                @ApiParam(value = "付款金额", required = true) @PathVariable("WIDtotal_amount") String WIDtotal_amount,
                                @ApiParam(value = "订单名称", required = true) @PathVariable("WIDsubject") String WIDsubject,
                                @ApiParam(value = "商品描述", required = true) @PathVariable("WIDbody") String WIDbody) {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = WIDout_trade_no;
        //付款金额，必填
        String total_amount = WIDtotal_amount;
        //订单名称，必填
        String subject = WIDsubject;
        //商品描述，可空
        String body = WIDbody;

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        try {
            String result = alipayClient.pageExecute(alipayRequest).getBody();
            return result;
        } catch (AlipayApiException e) {
            return "支付失败";
        }
    }


    @ApiOperation("订单退款")
    @GetMapping("refund/{WIDTRout_trade_no}/{WIDTRtrade_no}/{WIDTRrefund_amount}/{WIDTRrefund_reason}")
    public Response<String> refund(@ApiParam(value = "商户订单号", required = true) @PathVariable("WIDTRout_trade_no") String WIDTRout_trade_no,
                                   @ApiParam(value = "支付宝交易号", required = true) @PathVariable("WIDTRtrade_no") String WIDTRtrade_no,
                                   @ApiParam(value = "退款金额", required = true) @PathVariable("WIDTRrefund_amount") String WIDTRrefund_amount,
                                   @ApiParam(value = "退款原因", required = true) @PathVariable("WIDTRrefund_reason") String WIDTRrefund_reason) {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = WIDTRout_trade_no;
        //支付宝交易号
        String trade_no = WIDTRtrade_no;
        //请二选一设置
        //需要退款的金额，该金额不能大于订单金额，必填
        String refund_amount = WIDTRrefund_amount;
        //退款的原因说明
        String refund_reason = WIDTRrefund_reason;

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"trade_no\":\"" + trade_no + "\","
                + "\"refund_amount\":\"" + refund_amount + "\","
                + "\"refund_reason\":\"" + refund_reason + "\"}");

        try {
            String result = alipayClient.execute(alipayRequest).getBody();
            return Response.success(result);
        } catch (AlipayApiException e) {
            return Response.failed(e.getMessage());
        }

    }

    @ApiOperation("交易查询")
    @GetMapping("query/trade/{WIDTRout_trade_no}")
    public Response<String> refund(@ApiParam(value = "商户订单号", required = true) @PathVariable("WIDTRout_trade_no") String WIDTRout_trade_no) {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();

        //商户订单号，商户网站订单系统中唯一订单号
        String out_trade_no = WIDTRout_trade_no;

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"}");

        try {
            String result = alipayClient.execute(alipayRequest).getBody();
            return Response.success(result);
        } catch (AlipayApiException e) {
            return Response.failed(e.getMessage());
        }
    }

    @ApiOperation("支付异步通知")
    @GetMapping("send/asyn/trade")
    public Response<String> asyn(HttpServletRequest request) {
        try {
            //获取支付宝POST过来反馈信息
            Map<String, String> params = new HashMap<String, String>();
            Map<String, String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }

            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
            //——请在这里编写您的程序（以下代码仅作参考）——

	/* 实际验证过程建议商户务必添加以下校验：
	1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
	2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
	3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
	4、验证app_id是否为该商户本身。
	*/
            if (signVerified) {//验证成功
                //商户订单号
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

                //支付宝交易号
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

                //交易状态
                String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");

                if (trade_status.equals("TRADE_FINISHED")) {
                    //判断该笔订单是否在商户网站中已经做过处理
                    //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                    //如果有做过处理，不执行商户的业务程序

                    //注意：
                    //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
                } else if (trade_status.equals("TRADE_SUCCESS")) {
                    //判断该笔订单是否在商户网站中已经做过处理
                    //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                    //如果有做过处理，不执行商户的业务程序

                    //注意：
                    //付款完成后，支付宝系统发送该交易状态通知
                }

                return Response.success("success");

            } else {//验证失败
                return Response.failed("failed");

                //调试用，写文本函数记录程序运行情况是否正常
                //String sWord = AlipaySignature.getSignCheckContentV1(params);
                //AlipayConfig.logResult(sWord);
            }

            //——请在这里编写您的程序（以上代码仅作参考）——
        } catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    @ApiOperation("支付同步通知")
    @GetMapping("send/syn/trade")
    public Response<String> syn(HttpServletRequest request) {
        try {
            //获取支付宝GET过来反馈信息
            Map<String, String> params = new HashMap<String, String>();
            Map<String, String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }

            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

            //——请在这里编写您的程序（以下代码仅作参考）——
            if (signVerified) {
                //商户订单号
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

                //支付宝交易号
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

                //付款金额
                String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
                String result = "out_trade_no:" + out_trade_no + "\ntrade_no:" + trade_no + "\ntotal_amount" + total_amount;
                return Response.success(result);
            } else {
                return Response.failed("验签失败");
            }
            //——请在这里编写您的程序（以上代码仅作参考）——

            //——请在这里编写您的程序（以上代码仅作参考）——
        } catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }


}
