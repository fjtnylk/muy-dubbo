package com.muy;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * Created by yanglikai on 2017/7/26.
 */
public abstract class DO implements Serializable {
    public DO() {
    }

    public <T extends Dto> T parse(Class<T> dto) {
        T target = BeanUtils.instantiate(dto);
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
