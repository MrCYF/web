package com.fan.formal.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fan.formal.dao.CrmScore;
import com.fan.formal.mapper.CrmScoreMapper;
import com.fan.formal.service.CrmScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CrmScoreServiceImpl extends ServiceImpl<CrmScoreMapper,CrmScore> implements CrmScoreService {
    @Autowired
    private CrmScoreMapper crmScoreMapper;
    @Override
    public List<CrmScore> select() {
        List<CrmScore> list= crmScoreMapper.selectList(new QueryWrapper<CrmScore>().eq("PID","10019627"));
        //List<CrmScore> list = crmScoreMapper.select();

        return this.list(new QueryWrapper<>());
    }
}
