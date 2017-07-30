package com.muy;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * Created by yanglikai on 2017/7/26.
 */
public abstract class Query implements Serializable {
    public Query() {
    }

    public <T extends DO> T parse(Class<T> query) {
        T target = BeanUtils.instantiate(query);
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
