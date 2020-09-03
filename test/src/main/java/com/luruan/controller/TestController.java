package com.luruan.controller;

import com.luruan.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2 * @Author: ZG
 * 3 * @Date: 2020/8/30 20:07
 * 4
 */
@RestController
public class TestController {
    //@Autowired注入不严谨 改成了构造器注入
    final
    UserMapper userMapper;

    public TestController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public void test() {

        userMapper.selectAll();
    }


}
