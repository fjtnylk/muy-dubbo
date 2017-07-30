package com.muy.query.goods;

import com.muy.Dto;
import com.muy.Query;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class CategoryLoadLevelQuery extends Query {
    private Integer level;

    private CategoryLoadLevelQuery() {
    }

    public static CategoryLoadLevelQuery create() {
        return new CategoryLoadLevelQuery();
    }

    public CategoryLoadLevelQuery withId(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
