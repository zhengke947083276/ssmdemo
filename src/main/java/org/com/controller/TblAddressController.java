package org.com.controller;

import org.com.entity.TblAddress;
import org.com.entity.TblShopper;
import org.com.service.TblAddresssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/address")
public class TblAddressController {
    @Autowired
    TblAddresssService tblAddresssService;

    @RequestMapping("/select")
    public String select(Model model, HttpSession session){
        TblShopper user = (TblShopper) session.getAttribute("user");
        List<TblAddress> tblAddresses = tblAddresssService.selectByshopperId(user.getShopperId());
        model.addAttribute("tblAddresses",tblAddresses);
        return "addresses/select";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addresses/add";
    }

    @RequestMapping("/add")
    public String add(HttpSession session,String addressName){
        TblAddress tblAddress = new TblAddress();
        tblAddress.setAddressName(addressName);
        TblShopper shopper = (TblShopper) session.getAttribute("user");
        tblAddress.setShopperId(shopper.getShopperId());
        int i = tblAddresssService.add(tblAddress);
        return "redirect:/address/select";
    }

    @RequestMapping("/delete")
    public String delete(int addressId){
        tblAddresssService.delete(addressId);
        return "redirect:/address/select";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,int addressId){
        TblAddress tblAddress = tblAddresssService.selectByaddressId(addressId);
        model.addAttribute("tblAddress",tblAddress);
        return "addresses/update";
    }

    @RequestMapping("/update")
    public String update(TblAddress tblAddress){
        tblAddresssService.update(tblAddress);
        return "redirect:/address/select";
    }

}
