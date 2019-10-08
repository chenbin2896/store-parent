package com.auction.store.account.controller;

import com.alibaba.fastjson.JSONObject;
import com.auction.store.account.entity.Response;
import com.auction.store.account.entity.User;
import com.auction.store.account.service.UserService;
import com.auction.store.account.util.TestCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Map<String ,String > map = new HashMap<>();

    @ApiOperation("用户登录")
    @GetMapping("login/{tel}/{password}")
    public Response<User> login (@ApiParam(value = "电话", required = true) @PathVariable("tel") String tel,
                                 @ApiParam(value = "密码", required = true) @PathVariable("password") String password) {
        User user = new User();
        user.setTel(tel);
        user.setPassword(password);
        return userService.select(user);
    }

    @ApiOperation("批量生成模拟数据")
    @GetMapping("insert/mock")
    public Response<List<User>> insertMock () {
        List<User> users = new ArrayList<>();
        for (int i =0; i < 10; i++) {
            User user = new User();

        }
        return userService.insertMock(users);
    }

    @ApiOperation("用户注册")
    @PostMapping("insert/register/{code}")
    public Response<User> insertRegister (@ApiParam(value = "验证码") @PathVariable("code") String code, @RequestBody User user) {
        User userE = new User();
        userE.setTel(user.getTel());
        userE.setUsername(user.getUsername());
        Response<User> response =  userService.select(userE);
        if (response.getCode() == 0) {
            return Response.failed("该用户已注册");
        }

        if( code == null || code.length() == 0 ){
            return Response.failed("验证码为空");
        }
        if (map.get(user.getTel()) != null && map.get(user.getTel()).equals(code)) {
            return userService.insert(user);
        }else {
            return Response.failed("验证码错误");
        }

    }

    @ApiOperation("获取验证码")
    @GetMapping(value = "/get/code/{tel}")
    public Response<String> sendCode (String tel) {
        String code = TestCode.getCode();
        String url = "http://v.juhe.cn/sms/send?mobile=" + tel + "&tpl_id=188494&tpl_value=%23code%23%3d" + code+"&key=ff55f3176ca70a91101a31088836fba8";
        RestTemplate restTemplate = new RestTemplate();
        String json =  restTemplate.getForObject(url,String.class);
        JSONObject jsonObject = JSONObject.parseObject(json);
        String reason = (String) jsonObject.get("reason");
        if (reason.equals("操作成功")) {
            map.put(tel,code);
            return Response.success(code);
        }else {
            return Response.failed("获取验证码失败");
        }
    }

    @ApiOperation("查询用户信息")
    @GetMapping(value = "/select/user/info/{uid}")
    public Response<User> selectUserInfo (@PathVariable("uid") Integer uid) {
        User user = new User();
        user.setId(uid);
        return userService.select(user);
    }



}
