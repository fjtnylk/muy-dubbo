package com.muy.dto.goods;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.muy.Dto;

import java.util.Date;

/**
 * Created by yanglikai on 2017/7/28.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CategoryLoadDto extends Dto {
    @JsonProperty(value = "category_id")
    private Long id;
    private String name;
    private Integer level;
    private Long parentId;
    @JsonProperty(value = "is_parent_flg")
    private boolean isParentFlg;
    private Integer weight;
    private Integer status;
    private Date createTime;

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

    @JsonIgnore
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
