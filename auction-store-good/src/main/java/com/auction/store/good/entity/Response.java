package com.auction.store.good.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private int code;
    private String msg;
    private T data;

    public static Response success (Object data) {
        return new Response(0,"success",data);
    }

    public static Response failed (String msg) {
        return new Response(1,msg,null);
    }
}
