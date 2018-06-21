package org.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.com.entity.TblGoodstype;
import org.com.entity.TblGoodstypeExample;

public interface TblGoodstypeMapper {
    long countByExample(TblGoodstypeExample example);

    int deleteByExample(TblGoodstypeExample example);

    int deleteByPrimaryKey(Integer goodstypeId);

    int insert(TblGoodstype record);

    int insertSelective(TblGoodstype record);

    List<TblGoodstype> selectByExample(TblGoodstypeExample example);

    TblGoodstype selectByPrimaryKey(Integer goodstypeId);

    int updateByExampleSelective(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByExample(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByPrimaryKeySelective(TblGoodstype record);

    int updateByPrimaryKey(TblGoodstype record);
}