package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblGoods;
import org.com.entity.TblGoodsExample;

public interface TblGoodsMapper {
    long countByExample(TblGoodsExample example);

    int deleteByExample(TblGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(TblGoods record);

    int insertSelective(TblGoods record);

    List<TblGoods> selectByExample(TblGoodsExample example);

    TblGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByExample(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    int updateByPrimaryKeySelective(TblGoods record);

    int updateByPrimaryKey(TblGoods record);
}