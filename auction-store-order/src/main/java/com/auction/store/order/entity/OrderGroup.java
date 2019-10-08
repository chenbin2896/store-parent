package com.auction.store.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author User
 * @date 2019/10/6
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderGroup {

    private Integer oid;

    private String orderGenerateId;

    private Sell sell;

    private User user;

    private Double dealPrice;

    private Double commision;

    private Double orderTotalPrice;

    private Date dealTime;

    private Good good;

    private Integer buyCount;

    private String orderStatus;

    private String paymentChannel;

    private String orderTrade;
}
