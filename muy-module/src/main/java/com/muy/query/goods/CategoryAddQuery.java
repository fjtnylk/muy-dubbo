package com.muy.query.goods;

import com.muy.Query;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class CategoryAddQuery extends Query {
    private String name;
    private Integer level;
    private Long parentId;
    private boolean isParentFlg;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public boolean isParentFlg() {
        return isParentFlg;
    }

    public void setParentFlg(boolean parentFlg) {
        isParentFlg = parentFlg;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
