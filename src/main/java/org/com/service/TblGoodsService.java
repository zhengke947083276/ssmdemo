package org.com.service;


import org.com.entity.TblGoods;

import java.util.List;

public interface TblGoodsService {

    /**
     * 查询出所有商品
     * @return
     */
    public List<TblGoods> selectAll();

    /**
     * 根据输入的名称模糊查询商品
     * @param goodsName
     * @return
     */
    public List<TblGoods> selectByName(String goodsName);

    /**
     * 根据下拉列表选择的商品类型查询出商品
     * @param goodstypeId
     * @return
     */
    public List<TblGoods> selectByType(int goodstypeId);
}