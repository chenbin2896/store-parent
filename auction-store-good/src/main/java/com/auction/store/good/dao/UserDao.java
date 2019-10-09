package com.auction.store.good.dao;

import com.auction.store.good.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Good,Integer> {
}
