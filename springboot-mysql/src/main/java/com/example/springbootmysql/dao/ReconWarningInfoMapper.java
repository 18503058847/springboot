package com.example.springbootmysql.dao;


import com.example.springbootmysql.entity.ReconWarningInfo;

import java.util.List;

public interface ReconWarningInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReconWarningInfo record);

    int insertSelective(ReconWarningInfo record);

    ReconWarningInfo selectByPrimaryKey(Long id);

    List<ReconWarningInfo> selectAll();

    int updateByPrimaryKeySelective(ReconWarningInfo record);

    int updateByPrimaryKey(ReconWarningInfo record);
}