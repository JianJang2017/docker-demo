package com.jianjang.docker.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boss-demo
 * @description: 主页
 * @author: JianJang
 * @create: 2020-07-18 17:01
 * @blame BOSS Team
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("index.do")
    public JSONObject index(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","000000");
        jsonObject.put("message","交易成功");
        return jsonObject;
    }
}