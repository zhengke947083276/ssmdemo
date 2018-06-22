package org.com.service.impl;

import org.com.dao.TblAddressMapper;
import org.com.entity.TblAddress;
import org.com.entity.TblAddressExample;
import org.com.service.TblAddresssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblAddresssServiceImpl implements TblAddresssService {
    @Autowired
    TblAddressMapper tblAddressMapper;
    @Override
    public int add(TblAddress tblAddress) {
        return tblAddressMapper.insertSelective(tblAddress);
    }

    @Override
    public int update(TblAddress tblAddress) {
        return tblAddressMapper.updateByPrimaryKeySelective(tblAddress);
    }

    @Override
    public int delete(int addressId) {
        return tblAddressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public List<TblAddress> selectByshopperId(int shopperId) {
        TblAddressExample tblAddressExample = new TblAddressExample();
        TblAddressExample.Criteria criteria = tblAddressExample.createCriteria();
        criteria.andShopperIdEqualTo(shopperId);
        List<TblAddress> tblAddresses = tblAddressMapper.selectByExample(tblAddressExample);
        return tblAddresses;
    }

    @Override
    public TblAddress selectByaddressId(int addressId) {
        return tblAddressMapper.selectByPrimaryKey(addressId);
    }
}
