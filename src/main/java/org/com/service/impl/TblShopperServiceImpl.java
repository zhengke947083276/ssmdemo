package org.com.service.impl;

import org.com.dao.TblShopperMapper;
import org.com.entity.TblShopper;
import org.com.entity.TblShopperExample;
import org.com.service.TblShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblShopperServiceImpl implements TblShopperService {
    @Autowired
    TblShopperMapper tblShopperMapper;
    @Override
    public int resign(TblShopper shopper) {
        int i = tblShopperMapper.insertSelective(shopper);
        return i;
    }

    @Override
    public TblShopper select(String shopperTelnum, String shopperPassword) {
        TblShopperExample tblShopperExample = new TblShopperExample();
        TblShopperExample.Criteria criteria = tblShopperExample.createCriteria();
        criteria.andShopperTelnumEqualTo(shopperTelnum);
        criteria.andShopperPasswordEqualTo(shopperPassword);
        List<TblShopper> tblShoppers = tblShopperMapper.selectByExample(tblShopperExample);
        return tblShoppers.get(0);
    }

    @Override
    public int update(TblShopper shopper) {
        int i = tblShopperMapper.updateByPrimaryKey(shopper);
        return i;
    }
}
