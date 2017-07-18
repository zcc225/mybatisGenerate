package org.uzhai.dao;

import org.uzhai.model.TCompanyDetail;

public interface TCompanyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCompanyDetail record);

    int insertSelective(TCompanyDetail record);

    TCompanyDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCompanyDetail record);

    int updateByPrimaryKey(TCompanyDetail record);
}