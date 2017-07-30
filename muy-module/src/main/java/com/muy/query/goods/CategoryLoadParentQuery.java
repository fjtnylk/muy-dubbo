package com.muy.query.goods;

import com.muy.Dto;
import com.muy.Query;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class CategoryLoadParentQuery extends Query {
    private Long parentId;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
