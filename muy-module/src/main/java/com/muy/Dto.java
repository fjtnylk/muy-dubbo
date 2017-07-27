package com.muy;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;

/**
 * Created by yanglikai on 2017/7/26.
 */
public abstract class Dto implements Serializable {
    public Dto() {
    }

    public <T extends VO> T parse(Class<T> vo) {
        T target = BeanUtils.instantiate(vo);
        BeanUtils.copyProperties(this, target);
        return target;
    }
}
