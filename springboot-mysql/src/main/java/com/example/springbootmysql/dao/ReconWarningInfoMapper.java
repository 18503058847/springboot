package com.example.springbootmysql.dao;


import com.example.springbootmysql.entity.ReconWarningInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReconWarningInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReconWarningInfo record);

    int insertSelective(ReconWarningInfo record);

    ReconWarningInfo selectByPrimaryKey(Long id);

    List<ReconWarningInfo> selectAll();

    int updateByPrimaryKeySelective(ReconWarningInfo record);

    int updateByPrimaryKey(ReconWarningInfo record);
}