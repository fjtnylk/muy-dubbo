package com.muy.vo.goods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.muy.VO;

/**
 * Created by yanglikai on 2017/7/28.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CategoryRemoveVO extends VO {
    @JsonProperty(value = "category_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
