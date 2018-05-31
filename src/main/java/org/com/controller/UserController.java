package org.com.controller;

import org.com.entity.User;
import org.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
//        return "redirect:/*/*";// 请求重定向
//        return "forward:/*/*";//forward转发
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/add")
    public String add(User user){
        System.out.println(user);
        userService.insert(user);
        return "redirect:/user/selectAll";
    }
    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        List<User> users = userService.selectAll();
        model.addAttribute("users",users);
        return "selectAll";
    }
}
