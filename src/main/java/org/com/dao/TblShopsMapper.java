package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblShops;
import org.com.entity.TblShopsExample;

public interface TblShopsMapper {
    long countByExample(TblShopsExample example);

    int deleteByExample(TblShopsExample example);

    int deleteByPrimaryKey(Integer shopsId);

    int insert(TblShops record);

    int insertSelective(TblShops record);

    List<TblShops> selectByExample(TblShopsExample example);

    TblShops selectByPrimaryKey(Integer shopsId);

    int updateByExampleSelective(@Param("record") TblShops record, @Param("example") TblShopsExample example);

    int updateByExample(@Param("record") TblShops record, @Param("example") TblShopsExample example);

    int updateByPrimaryKeySelective(TblShops record);

    int updateByPrimaryKey(TblShops record);
}