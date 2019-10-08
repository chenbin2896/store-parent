package com.auction.store.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_goods")
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;

    private String gname;

    private Integer uid;

    private Date uploadTime;

    private String goodStatus;

    private Integer cid;

    private String remark;

    private Integer addressId;

}
