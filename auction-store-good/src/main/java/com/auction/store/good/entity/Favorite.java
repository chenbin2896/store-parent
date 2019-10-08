package com.auction.store.good.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author User
 * @date 2019/10/1
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_favorites")
@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;

    private Integer uid;

    private Integer gid;

    @CreationTimestamp
    private Date createtime;
}
