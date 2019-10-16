package com.auction.store.idcard.utils;

import java.util.UUID;

/**
 * Copyright：botBrain.ai
 * Author: Z.ChenBin
 * Date: 2019/10/15
 * Description:
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
