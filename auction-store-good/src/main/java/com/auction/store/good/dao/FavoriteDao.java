package com.auction.store.good.dao;

import com.auction.store.good.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author User
 * @date 2019/10/1
 * @description
 */
@Repository
public interface FavoriteDao extends JpaRepository<Favorite,Integer> {
}
