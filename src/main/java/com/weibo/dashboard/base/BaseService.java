package com.weibo.dashboard.base;

import com.baomidou.mybatisplus.plugins.Page;
import com.weibo.dashboard.base.BaseModel;

import java.util.List;
import java.util.Map;

/**
 * Created by wei.ma on 2017/1/25.
 */
public interface BaseService<T extends BaseModel> {
    public T update(T record);

    public void delete(Long id, Long userId);

    public T queryById(Long id);

    public Page<T> query(Map<String, Object> params);

    public <K> Page<K> getPage(Page<Long> ids, Class<K> cls);

    public <K> List<K> getList(List<Long> ids, Class<K> cls);


}
