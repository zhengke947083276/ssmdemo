package org.com.service;


import org.com.entity.TblGoodstype;

import java.util.List;

public interface TblGoodstypeService {

    /**
     * 查询所有商品类型
     * @param goodstypeId
     * @return
     */
    public List<TblGoodstype> selectAllType();
}
