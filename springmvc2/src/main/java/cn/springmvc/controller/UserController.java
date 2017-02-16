package cn.springmvc.controller;

/**
 * Created by luodejin on 17/2/7.
 */
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired //自动装配
    private UserService userService;

    @ResponseBody //接收Json对象字符串
    @RequestMapping("index")
    public User index(@RequestParam(name = "id")int id){
        return userService.selectUserById(id);
    }

}