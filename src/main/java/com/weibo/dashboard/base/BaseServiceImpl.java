package com.weibo.dashboard.base;

import com.baomidou.mybatisplus.plugins.Page;
import com.weibo.dashboard.base.BaseMapper;
import com.weibo.dashboard.base.BaseModel;
import com.weibo.dashboard.base.BaseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wei.ma on 2017/1/25.
 */
public abstract class BaseServiceImpl<T extends BaseModel> implements BaseService<T> {
    protected Logger logger = LogManager.getLogger(getClass());
    @Autowired
    protected BaseMapper<T> mapper;

    public T update(T record) {
        try {
            record.setEnable(true);
            record.setUpdateTime(new Date());
            if (record.getId() == null) {
                record.setCreateTime(new Date());
                mapper.insert(record);
            } else {
                mapper.updateById(record);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return record;
    }

    /*逻辑删除，将状态置为false*/
    public void delete(Long id, Long userId) {
        try {
            T record = this.queryById(id);
            record.setEnable(false);
            record.setUpdateTime(new Date());
            record.setUpdateBy(userId);
            mapper.updateById(record);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public T queryById(Long id) {
        T record = mapper.selectById(id);
        return record;
    }

    public Page<T> query(Map<String, Object> params) {
        return null;
    }

    /**
     * 分页查询
     */
    public <K> Page<K> getPage(Page<Long> ids, Class<K> cls) {
        return null;
    }

    public <K> List<K> getList(List<Long> ids, Class<K> cls) {
        return null;
    }
}
