package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblShopper;
import org.com.entity.TblShopperExample;

public interface TblShopperMapper {
    long countByExample(TblShopperExample example);

    int deleteByExample(TblShopperExample example);

    int deleteByPrimaryKey(Integer shopperId);

    int insert(TblShopper record);

    int insertSelective(TblShopper record);

    List<TblShopper> selectByExample(TblShopperExample example);

    TblShopper selectByPrimaryKey(Integer shopperId);

    int updateByExampleSelective(@Param("record") TblShopper record, @Param("example") TblShopperExample example);

    int updateByExample(@Param("record") TblShopper record, @Param("example") TblShopperExample example);

    int updateByPrimaryKeySelective(TblShopper record);

    int updateByPrimaryKey(TblShopper record);
}