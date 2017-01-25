package com.weibo.dashboard.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.weibo.dashboard.entity.SysDic;

import java.util.Map;

/**
 * Created by wei.ma on 2017/1/25.
 */
public interface ISysDicService {

    public Map<String, Map<String, String>> getAllDic();

    public void updateDic(SysDic record);

    public void deleteDic(Long id);

    public SysDic queryDicById(Long id);

    public Page<SysDic> queryDic(Map<String, Object> params);

}
