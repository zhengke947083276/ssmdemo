package org.com.controller;

import org.com.entity.TblShopper;
import org.com.service.TblShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/shopper")
public class TblShopperController {
    @Autowired
    TblShopperService tblShopperService;

    @RequestMapping("/zc")
    public String zc(){
        return "TblShopper/resign";
    }

    @RequestMapping("/dl")
    public String dl(){
        return "TblShopper/login";
    }

    @RequestMapping("/resign")
    public String resign(TblShopper tblShopper) {
        int i = tblShopperService.resign(tblShopper);
        if (i>0){
            //注册成功
            return "TblShopper/login";
        }
        //失败
        return "TblShopper/resign";
    }
    @RequestMapping("/select")
    public String select(String shopperTelnum, String shopperPassword, HttpSession session){
        TblShopper tblShopper = tblShopperService.select(shopperTelnum, shopperPassword);
        if (tblShopper!=null) {
            session.setAttribute("user", tblShopper);
            return "redirect:/tblGoods/selectAll";
        }
        return "redirect:/shopper/dl";
    }
    @RequestMapping("/update")
    public String update(TblShopper tblShopper,HttpSession session){
        int i = tblShopperService.update(tblShopper);
        session.removeAttribute("user");
        session.invalidate();
        return "TblShopper/shopper";

    }
    /**
     * 点击个人信息页面
     */
    @RequestMapping("/showShopper")
    public String showShopper(HttpSession session){

        return "/TblShopper/shopper";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/tblGoods/selectAll";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(){
        return "TblShopper/ShopperMessage";
    }



}
