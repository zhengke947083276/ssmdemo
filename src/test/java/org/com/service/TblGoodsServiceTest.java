package org.com.service;

import org.com.entity.TblGoods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public class TblGoodsServiceTest {
    @Autowired
    TblGoodsService tblGoodsService;
    @Test
    public void selectAll() {
        List<TblGoods> tblGoods = tblGoodsService.selectAll();
        for (TblGoods tblGood:tblGoods
             ) {
            System.out.println(tblGood.getGoodsName()+"2222222222");
        }
    }

    @Test
    public void selectByName() {
        List<TblGoods> tblGoods = tblGoodsService.selectByName("洗面奶");
        for (TblGoods tblGood:tblGoods
             ) {
            System.out.println(tblGood.getGoodsName()+"3333333333");
        }
    }

    @Test
    public void selectByType() {
        List<TblGoods> tblGoods = tblGoodsService.selectByType(1);
        for (TblGoods tblGood:tblGoods
             ) {
            System.out.println(tblGood.getGoodsName()+"4444444444");
        }

    }
}