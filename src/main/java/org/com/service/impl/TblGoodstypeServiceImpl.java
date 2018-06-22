package org.com.service.impl;

import org.com.dao.TblGoodstypeMapper;
import org.com.entity.TblGoodstype;
import org.com.service.TblGoodstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblGoodstypeServiceImpl implements TblGoodstypeService {

    @Autowired
    TblGoodstypeMapper tblGoodstypeMapper;
    @Override
    public List<TblGoodstype> selectAllType() {
        List<TblGoodstype> tblGoodstypes = tblGoodstypeMapper.selectByExample(null);
        return tblGoodstypes;
    }
}
