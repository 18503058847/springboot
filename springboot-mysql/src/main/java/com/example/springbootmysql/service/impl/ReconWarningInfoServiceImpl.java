package com.example.springbootmysql.service.impl;


import com.example.springbootmysql.dao.ReconWarningInfoMapper;
import com.example.springbootmysql.entity.ReconWarningInfo;

import com.example.springbootmysql.service.ReconWarningInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service("reconWarningInfoServiceImpl")
public class ReconWarningInfoServiceImpl implements ReconWarningInfoService {

    private final static Logger logger = LoggerFactory.getLogger(ReconWarningInfoServiceImpl.class);

    @Autowired
    ReconWarningInfoMapper reconWarningInfoMapper;

    @Override
    public List<ReconWarningInfo> getReconWarningList() {
        logger.info("[对账预警]-[查询预警列表]");
        try {
            return Optional.ofNullable(reconWarningInfoMapper.selectAll()).orElse(Collections.emptyList());
        }catch(Exception e){
            logger.info("[对账预警]-[查询系统异常，errorMsg={}]",e.getMessage());
            return null;
        }

    }
}
