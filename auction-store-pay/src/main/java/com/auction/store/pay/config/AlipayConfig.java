package com.auction.store.pay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

	public static String app_id = "2016101000652927";
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDLjqLUc73FZo3nZegEo2yECJEBPeUrkbAW4laHwDCB7ppnp0szttnAB4tQwK7x0UecfuB+OHeO/b8CLj5da4HJ0yN6ga7v7lY/0E9mZispLINjXUuPIqGVG5O+iaFjPaoTODBpDQbwHhv4zd8kfZg6/IUuABuf25M+4dQbeIxmuGOaoEcFuZ98pWYNQHszsRHnJ5RVjeuYDZcPY/GuvjLuAg4SbkPSMmEACa383P8ryydwKZd78Wypg8g2PabU+SWFZV7fFb83wjrW1EugWdr6wYnr0ja8Wtzm1GA4gr9FzOv/iMTSBcTR2Dz+yhsbg3eXzjr7tge68s21mmGV97H7AgMBAAECggEBAIkPodQrmrwwMZx9oZx97bN5kSmk44pSrp66CEmfvwm9/3mLy7cmh7glXEkjdKieofld9QsIOnitos91E8kTenDLGjiC2af0c17EhLIOWUGAF3fwedAHIYWk6/Z/9Ys9GieWzgHuI53KqEr/VCDd8ILHRWWT7QXWc28D4C4fHWqLyczNn3WQMdajJQ2zBFbfc7eShDo84YwUni9d46np7tHDyUPqcAxq9+H77jYeBBzvkfev1hAGbc5yS5tx4t4/zCHhFoBDc3GJB7nqpWaGkJoihWkGsA8K7gr7tzGa1sr7JbG+PrYckckxnZE0mCOgVfIfZsqMzIz929qsDKDqDAECgYEA7qrim/HuOF5V1Tk6tL2a2LRbxRfr/rMNbRgIbFwOg4aHVQRLAk72Oc6KTge0yElSXDlYFtb2Y8smNIVFv7DLwxsVJt/3XhYdvLoc1e42D9mOd+JC95PWeNWgCaHjaqJ9SLiP3L1R2O8fnsoXsu4HaZrAerdtAp5uqBTpBaJzntECgYEA2lcB6c5GEa79WfdXKtYKpvb7ur8EthQGaovkyQl268NDnbig0c8w/VlLrCbWkMO6DaG80Qc0mJ6wl+Ge/YKnSnUwhKilCoAnmEVD/pmQ0RDwDnFy4jYZG1qpdy8dhK91mP3+AlLrkXHUy9t7xihUjNxBxZe125BL2KE0Mbw/rwsCgYA/eadnPkLTLxO4782TQFIsjFtT4fbb+Jb7isbCuwEJLgBUNh4U8Rc/bJUQB7CnDAkhigbJnEZPaDozAbb5MnYe39cSTcKmfU9PYFhG9WHfeUcQz1ZsLh9+Z6J2rV2kgK69ZoisdpWMEpzgSHNhHTlPdt72RE5zwdtATL9kxj3l4QKBgGQhOMBnl5yueoOSucfsRxBQ/hqjVV7HCjY8l5xWmdH/R3gCXsY5VYcqN1joqsfS6vUrcjMOMeG4DNZqYwZxr5Sm76w2xxFsujvLsCYHePFX6i9FeeEh3Bu+VS9STSA3cx/Jg36/VkbqRCOFMVsrzbKXpBYgwAbEQvRC4XPZl/8HAoGAD0lg1JavPG6bL+lN2/Ln5l1J3tSpPUoP3U5FSOTKujmVfsaZDvhFqHkwuKWek9R9vIkE2G02bK3e7yPMLTcQt71ucl7p2R4xPCPc98CBZDxCthRKJfTQcj/MMUyhu2USHoLqX2qcWli7DBXDvvUWXpLDD8V51XaD3dEK3yKS1ug=";
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsL4DZXKJXNrjlAPvY94ZKsmKgaI9b+076pPKUvZ/0SBE8sZHyJzeqLPe3BM1lhfdjtGMeF1km1MtEMR24GWCxvkX4SVGfRjCd5c6jebg5b0Dxnou8qD2mWKwWrAJrvzJWO4vuDn9Lhv0DLW3RCmSHVxbhcIw+M0Xp50/YFW2/O7qYcK/RV1OJzxyCzwOo9Vr4FmcfdaVEz9CeLEbcIPuFHffQibr/uQkT69rjosVFykSETSZ9pG2ytqG8CRx+1uVYrTZF/wyc9+402iAjh0LDIaEJkRylV9ONLWRMIC+4U2XDyW1zwFF7dBJXAYoP6OnouN020GgiOTdOChWZZaSRQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://xixi.natapp4.cc/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://xixi.natapp4.cc/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	public static String sign_type = "RSA2";
	public static String charset = "utf-8";
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	public static String log_path = "D:\\";


    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

