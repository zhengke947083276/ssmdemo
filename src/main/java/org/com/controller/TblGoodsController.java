package org.com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.com.entity.TblGoods;
import org.com.entity.TblGoodstype;
import org.com.service.TblGoodsService;
import org.com.service.TblGoodstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/tblGoods")
public class TblGoodsController {
    @Autowired
    TblGoodsService tblGoodsService;
    @Autowired
    TblGoodstypeService tblGoodstypeService;


    /**
     * 进入首页，查询出所有商品
     * @param model
     * @param pn
     * @return
     */
    @RequestMapping("/selectAll")
    public String selectAll(Model model, @RequestParam(value = "pn",defaultValue = "1")int pn){
        //引入分页插件
        PageHelper.startPage(pn,5);

        List<TblGoods> tblGoods = tblGoodsService.selectAll();
        //封装详细的分页信息到PageInfo里
        PageInfo pageInfo = new PageInfo(tblGoods,5);
        model.addAttribute("pageInfo",pageInfo);
        //查询出所有的商品类型传到前台界面
        List<TblGoodstype> tblGoodstypes = tblGoodstypeService.selectAllType();
        model.addAttribute("goodstypes",tblGoodstypes);
        return "goods/show";
    }

    /**
     * 根据在输入框输入的商品名进行模糊查询
     * @param model
     * @param pn
     * @param goodsName
     * @return
     */
    @RequestMapping("/selectByName")
    public String selectByName(Model model,@RequestParam(value = "pn",defaultValue = "1")int pn,String goodsName){
        //引入分页插件
        PageHelper.startPage(pn,5);

        List<TblGoods> tblGoods = tblGoodsService.selectByName(goodsName);
        //将所有信息封装到PageInfo里面
        PageInfo pageInfo = new PageInfo(tblGoods,5);
        model.addAttribute("pageInfo",pageInfo);
        //查询出所有的商品类型传到前段界面
        List<TblGoodstype> tblGoodstypes = tblGoodstypeService.selectAllType();
        model.addAttribute("goodstypes",tblGoodstypes);
        return "goods/show";
    }

    /**
     * 根据选择的商品类型查询出所有商品
     * @param model
     * @param pn
     * @param goodstypeId
     * @return
     */
    @RequestMapping("/selectByType")
    public String selectByType(Model model,@RequestParam(value = "pn",defaultValue = "1")int pn,int goodstypeId){
        //引入分页插件
        PageHelper.startPage(pn,5);
        System.out.println(goodstypeId);
        List<TblGoods> tblGoods = tblGoodsService.selectByType(goodstypeId);
        //将所有信息封装到PageInfo里面
        PageInfo pageInfo = new PageInfo(tblGoods,5);
        model.addAttribute("pageInfo",pageInfo);
        //查询出所有的商品类型传到前段界面
        List<TblGoodstype> tblGoodstypes = tblGoodstypeService.selectAllType();
        model.addAttribute("goodstypes",tblGoodstypes);
        model.addAttribute("id",goodstypeId);
        return "goods/show";
    }
}
