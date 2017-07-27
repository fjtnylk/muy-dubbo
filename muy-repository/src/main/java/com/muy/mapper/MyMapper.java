package com.muy.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by yanglikai on 2016/8/17.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
