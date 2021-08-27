package com.wei.controller;


import com.wei.common.lang.Result;
import com.wei.entity.User;
import com.wei.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wei
 * @since 2021-05-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
//    @GetMapping("/index")
//    public Result index(){
//        User user =userService.getById(1L);
//        return Result.succ(user);
//
//    }
    @RequiresAuthentication
    @GetMapping("/index")
    public String index(){

        return "hello";

    }
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }

}
