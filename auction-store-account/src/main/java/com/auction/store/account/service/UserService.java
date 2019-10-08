package com.auction.store.account.service;

import com.auction.store.account.dao.UserDao;
import com.auction.store.account.entity.Response;
import com.auction.store.account.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 生成模拟数据
     * @param users
     * @return
     */
    public Response<List<User>> insertMock(List<User> users) {
        try{
            return Response.success(userDao.saveAll(users));
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 查询用户
     * @return
     */
    public Response<User> select (User user) {
        try{
            Example<User> example = Example.of(user);
            Optional<User> opt =  userDao.findOne(example);
            return Response.success(opt.get());
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public Response<User> insert (User user) {
        try{
            return Response.success(userDao.save(user));
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

}
