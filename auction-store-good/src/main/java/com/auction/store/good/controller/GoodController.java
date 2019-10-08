package com.auction.store.good.controller;

import com.auction.store.good.entity.Good;
import com.auction.store.good.entity.Response;
import com.auction.store.good.service.GoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/test")
    public String test  () {
        return "sdfa";
    }

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






}
