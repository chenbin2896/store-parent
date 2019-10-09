package com.auction.store.good.controller;

import com.auction.store.good.entity.Good;
import com.auction.store.good.entity.Response;
import com.auction.store.good.service.GoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/v1/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @ApiOperation("查询商品-我的收藏")
    @GetMapping("select/good/favorite/{uid}/{date}")
    public Response<List<Good>> selectFavoriteGood (@PathVariable("uid") Integer uid,
                                                    @ApiParam(name = "date", value = "收藏日期", required = false)  @PathVariable("date") Date date) {
        return goodService.selectFavorite(uid, date);
    }

    @ApiOperation("删除商品-我的收藏")
    @GetMapping("delete/good/favorite/{uid}/{gid}")
    public Response<Good> deleteFavoriteGood (@PathVariable("uid")  Integer uid, @PathVariable("gid") Integer gid) {
        return goodService.deleteFavorite(uid,gid);
    }

    @ApiOperation("添加商品-我的收藏")
    @GetMapping("insert/good/favorite/{uid}/{gid}")
    public Response<Good> insertFavoriteGood (@PathVariable("uid")  Integer uid, @PathVariable("gid") Integer gid) {
        return goodService.insertFavorite(uid, gid);
    }

    @ApiOperation("我的拍品")
    @GetMapping("select/good/bidding/{uid}/{status}")
    public Response<List<Good>> insertFavoriteGood (@PathVariable("uid")  Integer uid, @PathVariable("status") String status) {
        return goodService.biddingGood(uid, status);
    }

    @ApiOperation("保存商品")
    @PostMapping("insert/good")
    public Response<Good> insertGood (@RequestBody Good good) {
        return goodService.insert(good);
    }








}
