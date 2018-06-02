package org.com.controller;

import org.com.entity.User;
import org.com.entity.UserDemo;
import org.com.view.ViewExcel;
import org.com.view.ViewPDF;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/view")
public class ViewDemo {

    @RequestMapping(value = "/excel")
    public ModelAndView viewExcel() {
        System.out.println("=============excel================");
        Map<String, Object> model = new HashMap<>();
        model.put("userDemos", getStudents());
        return new ModelAndView(new ViewExcel(), model);
    }
    private List<UserDemo> getStudents() {
        List<UserDemo> userDemos = new ArrayList<UserDemo>();
        UserDemo userDemo = new UserDemo("1", "Tome", "Tom@qq.com", "123456");
        userDemos.add(userDemo);
        return userDemos;
    }


    @RequestMapping("/pdf")
    public ModelAndView viewPDF(){
        System.out.println("=============pdf================");
        Map<String, Object> model = new HashMap<>();
        model.put("userDemos", getStudents());
        return new ModelAndView(new ViewPDF(), model);
    }



}
