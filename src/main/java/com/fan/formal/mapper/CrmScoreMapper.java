package com.fan.formal.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.formal.dao.CrmScore;

import java.util.List;

public interface CrmScoreMapper extends BaseMapper<CrmScore> {

    List<CrmScore> select();
}
