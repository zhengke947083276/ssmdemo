package org.com.controller;

import org.com.entity.TblGoods;
import org.com.entity.TblOrder;
import org.com.entity.TblShopper;
import org.com.service.TblGoodsService;
import org.com.service.TblOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/order")
public class TblOrderController {
    @Autowired
    TblOrderService tblOrderService;

    @RequestMapping("/selectAll")
    public String selectAll(HttpSession session, Model model){
        TblShopper tblShopper = (TblShopper) session.getAttribute("user");
        List<TblOrder> tblOrders = tblOrderService.select(tblShopper.getShopperId());
        model.addAttribute("tblOrders",tblOrders);
        return "order/selectAll";
    }
    @RequestMapping("/delete")
    public  String delete(int orderId){
        int i = tblOrderService.delete(orderId);
        return "forward:/order/selectAll";
    }
    @RequestMapping("/update")
    public  String update(TblOrder tblOrder,HttpSession session){
        TblShopper user = (TblShopper)session.getAttribute("user");
        tblOrder.setShopperId(user.getShopperId());
        int i = tblOrderService.update(tblOrder);
        return "forward:/order/selectAll";
    }
    @RequestMapping("/add")
    public String add(TblOrder tblOrder){
        tblOrder.setOrderTime(new Date());
        tblOrder.setOrderState(1);
        tblOrder.setGoodsNumber(1);
        tblOrderService.add(tblOrder);
        return "forward:/tblGoods/selectAll";
    }

}
