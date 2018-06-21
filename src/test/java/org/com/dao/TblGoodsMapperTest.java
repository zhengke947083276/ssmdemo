package org.com.dao;

import org.com.entity.TblGoodsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//Spring+JUnit4集成测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml","classpath:springmvc-config.xml"})
public class TblGoodsMapperTest {
    @Autowired
    TblGoodsMapper tblGoodsMapper;
    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {

    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
        tblGoodsMapper.selectByPrimaryKey(1);
    }

    @Test
    public void updateByExampleSelective() {
        TblGoodsExample tblGoodsExample = new TblGoodsExample();
        TblGoodsExample.Criteria criteria = tblGoodsExample.createCriteria();
        criteria.andGoodsNameLike("%x%");
        tblGoodsMapper.selectByExample(tblGoodsExample);
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}