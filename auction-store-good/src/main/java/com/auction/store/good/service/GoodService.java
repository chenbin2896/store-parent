package com.auction.store.good.service;


import com.auction.store.good.dao.FavoriteDao;
import com.auction.store.good.dao.GoodDao;
import com.auction.store.good.entity.Favorite;
import com.auction.store.good.entity.Good;
import com.auction.store.good.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Service
public class GoodService {

    @Autowired
    private GoodDao goodDao;

    @Autowired
    private FavoriteDao favoriteDao;

    /**
     * 生成模拟数据
     * @param users
     * @return
     */
    public Response<List<Good>> insertMock(List<Good> users) {
        try{
            return Response.success(goodDao.saveAll(users));
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 查询商品
     * @return
     */
    public Response<Good> select (Good good) {
        try{
            Example<Good> example = Example.of(good);
            Optional<Good> opt =  goodDao.findOne(example);
            return Response.success(opt.get());
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 保存商品
     * @param good
     * @return
     */
    public Response<Good> insert (Good good) {
        try{
            return Response.success(goodDao.save(good));
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 我的收藏
     * @param uid
     * @return
     */
    public Response<List<Good>> selectFavorite (Integer uid, Date uploadTime) {
        Favorite favorite = new Favorite();
        favorite.setUid(uid);
        if (uploadTime != null) {
            favorite.setCreatetime(uploadTime);
        }
        Example<Favorite> example = Example.of(favorite);
        List<Favorite> favoriteList = favoriteDao.findAll(example);
        List<Integer> gidList = new ArrayList<>();
        for (Favorite f : favoriteList) {
            Integer gid =  f.getGid();
            gidList.add(gid);
        }
        List<Good> goodList = goodDao.findAllById(gidList);
        try {
            return Response.success(goodList);
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 删除我的收藏
     * @param uid
     * @param gid
     * @return
     */
    public Response<Good> deleteFavorite (Integer uid, Integer gid) {
        try {
            Favorite favorite = new Favorite();
            favorite.setUid(uid);
            favorite.setGid(gid);
            Example<Favorite> example = Example.of(favorite);
            Optional<Favorite> favorite1 = favoriteDao.findOne(example);
            favoriteDao.delete(favorite1.get());
            return Response.success(favorite1);
        }catch (Exception e ) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 加入收藏
     * @param uid
     * @param gid
     * @return
     */
    public Response<Good> insertFavorite (Integer uid, Integer gid) {
        Favorite favorite = new Favorite();
        favorite.setUid(uid);
        favorite.setGid(gid);
        Example<Favorite> example = Example.of(favorite);
        Optional<Favorite> favorite1 = favoriteDao.findOne(example);
        if (favorite1.get() != null) {
            return Response.failed("该商品已收藏");
        }
        try {
            return Response.success(favoriteDao.save(favorite));
        }catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

    /**
     * 我的拍品
     * @param uid
     * @param status
     * @return
     */
    public Response<List<Good>> biddingGood (Integer uid, String status) {
        try {
            Good good = new Good();
            good.setUid(uid);
            good.setGoodStatus(status);
            Example<Good> example =  Example.of(good);
            List<Good> goodList = goodDao.findAll(example);
            return Response.success(goodList);
        } catch (Exception e) {
            return Response.failed(e.getMessage());
        }
    }

}
