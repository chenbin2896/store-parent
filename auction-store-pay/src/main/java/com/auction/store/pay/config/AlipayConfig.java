package com.auction.store.pay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101000652927";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCLLwukGtA8sY6FG1LlKXe9q5cKNOQ9nkPu8MfYnSSNfHavgKzQ24D11yH2ROPLPAkEHs7tr2sIBcLKeH5DcIAEy0aflOH+sSZc1eTKJA/DT9QLpYOaJdjAoMnEiWj3gZF/frMhqnM7WtFrpLITtV5Y4pqRKeiYCIu1AEmE/PYQOp2dVhTyVc+OLvM782gqYV7HP3mfVWEVXQcqWycpsJbJASNc6iDV/L/fg5sGcoTYIG7eH1soTYsMSGf9ZkyPZfyThNoRsVYRBtalDo2F36gjPsYw7m7BjUJJOX6ytjhOKj3Gn5mLlnVUQdg+vm1a6p8Qbir5xAdjA9GXoqxAPWe7AgMBAAECggEAbvcxFsLx5pHBCMpCCsZG2wckwlRs69t0WdnJ2x9d9xeWIFI8db+rT1UXlJpT6sKQhaJyY/mJIbpGFNqAABB/YFMYmT4/96kQ5s75O1gI4TSR4D8zbwBhkSIf+vt6nmnEsJs5Acw9VsMPV/zUpPXipIb1qGp7MEsP51y1QLvVChYkNkLuJ/UpreATz0WMYjuVWaF99ovN/lCBK7mHMyKuwoxNgaV0t372gF31xFS07duDBQKs8wFE9DiF6Z4Svda9Fvpwq3D9B89I0hUN5Be1bWu5/YCVN0M+5s2CLcu9bzUoKQ2VhV5j1aRVK5NppvikOIsiPOVGhR74lNO3vABfsQKBgQDE2Rb5abZkehzQKKgyRGCuXXy10cvhsq0gf+mBCZGbsiGrCfPfoMD4e6XsuoUquyzp7YVABi8Hihos/qJFOH/zfOm+RX/EPW5kRCY9QORCsUctI8f2ARoLP+01HCzTFELC2UQ5RLlOJEmy3Gk3LwPeIOScoeZ8+Vf3m9RyhgSuJQKBgQC1AgYdQQPAoPZyS0ThzdummSybNw3o0BTI4qhaOoevIYTvt0Kd6/y7WbE40H7/sc5s9YNGQCl4H+EP9QQIxUIIvylabIR3nDWy4QLPb5IUGQkDfgrQtW8FKzNfnCHh0P4mAfSt5nEVVVeQrJ3WCn64nsvfQ3nZG2Ein/ouZq8oXwKBgAQv4e84Mmr8tfQviTRYg/3xex+a8M1CMbCJR/w4qeI37cNnmMpe7vvaFXNtnDuGc7QeG0F7YDC23UurtuPmCcKyG36yl78i12BGmtGeubw5bRwmsLAo4dbvaypACSwMOEdQu8TEE3T4DKFDUvGbjGeDJ5m1T+PEofxgUiqFc0AJAoGBAK/4XLtZ9mzxz0WEGV4whIbtSOlI15PrnxlBCQxW9Iv02Uk272OaBaSZ6OnkAGNSl+1jrZDBVc97ppCd0aM5Kh5Ywbov34Rs7+OMTvAddnVldVbY1WjbyifLPPGJV4Mya7HFmvrpGiz0P+HdfsCUiWewsWDHN5EyxfckcdNkboqfAoGBALChVfO+egmQ5MuJ3uiCxfeXABhUaaI6YP/3sX/to53YZLgOmSRiIkpyRKMKGB4GsOrgFFzi5XPYkqbFcrwRmDWdqACR9nXQ6iIlHQTr601eoBblpk1L+KgcUQBY7ZCMc8yN5ZSL7Rbp5AW2YKCE3auPmkZkY6ckTyBejgUhTY0a";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsL4DZXKJXNrjlAPvY94ZKsmKgaI9b+076pPKUvZ/0SBE8sZHyJzeqLPe3BM1lhfdjtGMeF1km1MtEMR24GWCxvkX4SVGfRjCd5c6jebg5b0Dxnou8qD2mWKwWrAJrvzJWO4vuDn9Lhv0DLW3RCmSHVxbhcIw+M0Xp50/YFW2/O7qYcK/RV1OJzxyCzwOo9Vr4FmcfdaVEz9CeLEbcIPuFHffQibr/uQkT69rjosVFykSETSZ9pG2ytqG8CRx+1uVYrTZF/wyc9+402iAjh0LDIaEJkRylV9ONLWRMIC+4U2XDyW1zwFF7dBJXAYoP6OnouN020GgiOTdOChWZZaSRQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://xixi.natapp4.cc/v1/pay/send/asyn/trade";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://xixi.natapp4.cc/pay/send/syn/trade";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
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
