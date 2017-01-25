package com.weibo.dashboard.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.weibo.dashboard.base.BaseServiceImpl;
import com.weibo.dashboard.dao.SysDicMapper;
import com.weibo.dashboard.entity.SysDic;
import com.weibo.dashboard.service.ISysDicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * Created by wei.ma on 2017/1/25.
 */
@Service
public class SysDicServiceImpl extends BaseServiceImpl<SysDic> implements ISysDicService {
    @Autowired
    private SysDicMapper dicMapper;

    public Map<String, Map<String, String>> getAllDic() {
        return null;
    }

    public void updateDic(SysDic record) {
        super.update(record);
    }

    public void deleteDic(Long id) {
        /*硬删除*/
       dicMapper.deleteById(id);
    }

    public SysDic queryDicById(Long id) {
        return super.queryById(id);
    }


    public Page<SysDic> queryDic(Map<String, Object> params) {
        return null;
    }


}
