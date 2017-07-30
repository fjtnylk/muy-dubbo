package com.muy.query.goods;

import com.muy.Query;

import java.util.Date;

/**
 * Created by yanglikai on 2017/7/28.
 */
public class CategoryUpdateQuery extends Query {
    private Long id;
    private String name;
    private Integer level;
    private Long parentId;
    private boolean isParentFlg;
    private Integer weight;
    private Integer status;
    private Date updateTime;

    public CategoryUpdateQuery() {
        this.updateTime = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
