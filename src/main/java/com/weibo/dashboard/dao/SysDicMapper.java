package com.weibo.dashboard.dao;

import com.weibo.dashboard.base.BaseMapper;
import com.weibo.dashboard.entity.SysDic;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by wei.ma on 2017/1/25.
 */
public interface SysDicMapper extends BaseMapper<SysDic> {
    List<Long> selectIdByMap(@Param("cm") Map<String, Object> params);
}