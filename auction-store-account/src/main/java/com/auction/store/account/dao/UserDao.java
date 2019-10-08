package com.auction.store.account.dao;

import com.auction.store.account.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {

}
