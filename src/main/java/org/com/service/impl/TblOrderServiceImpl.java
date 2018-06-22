package org.com.service.impl;

import org.com.dao.TblGoodsMapper;
import org.com.dao.TblOrderMapper;
import org.com.entity.TblGoods;
import org.com.entity.TblOrder;
import org.com.entity.TblOrderExample;
import org.com.service.TblOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public class TblOrderServiceImpl implements TblOrderService {
    @Autowired
    TblOrderMapper tblOrderMapper;

    @Autowired
    TblGoodsMapper tblGoodsMapper;
    @Override
    public int add(TblOrder tblOrder) {
        int i = 0;

        TblOrderExample tblOrderExample = new TblOrderExample();
        TblOrderExample.Criteria criteria = tblOrderExample.createCriteria();
        criteria.andGoodsIdEqualTo(tblOrder.getGoodsId());
        criteria.andShopperIdEqualTo(tblOrder.getShopperId());
        criteria.andOrderStateEqualTo(tblOrder.getOrderState());
        List<TblOrder> tblOrders = tblOrderMapper.selectByExample(tblOrderExample);
        if (tblOrders!=null&&tblOrders.size()!=0){
            tblOrders.get(0).setGoodsNumber(tblOrders.get(0).getGoodsNumber()+1);
            i = tblOrderMapper.updateByPrimaryKeySelective(tblOrders.get(0));
        }else {
            i = tblOrderMapper.insertSelective(tblOrder);
        }
        return i;
    }
    @Override
    public int update(TblOrder tblOrder) {
        int update = tblOrderMapper.updateByPrimaryKeySelective(tblOrder);
        return update;
    }

    @Override
    public int delete(int orderId) {
        int i = tblOrderMapper.deleteByPrimaryKey(orderId);
        return i;
    }

    @Override
    public List<TblOrder> select(int shopperId) {

        TblOrderExample tblOrderExample = new TblOrderExample();
        TblOrderExample.Criteria criteria = tblOrderExample.createCriteria();
        criteria.andShopperIdEqualTo(shopperId);
        criteria.andOrderStateEqualTo(1);
        List<TblOrder> tblOrders = tblOrderMapper.selectByExample(tblOrderExample);
        for (TblOrder tblOrder : tblOrders) {
            TblGoods tblGoods = tblGoodsMapper.selectByPrimaryKey(tblOrder.getGoodsId());
            tblOrder.setTblGoods(tblGoods);
        }
        return tblOrders;
    }
}
