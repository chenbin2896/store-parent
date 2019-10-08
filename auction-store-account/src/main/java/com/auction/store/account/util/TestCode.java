package com.auction.store.account.util;

import java.util.Random;

/**
 * @author User
 * @date 2019/10/1
 * @description
 */
public class TestCode {

    private final static int codeLength =5;

    /**
     * @return 验证码字符串
     */
    public static String getCode(){

        Random rand = new  Random();
        int  a ;
        String  result ="";
        for( int j =0; j<codeLength; j++ ){
            a = Math.abs( rand.nextInt()%9 );
            result += String.valueOf(a);
        }
        return  result;
    }
}
