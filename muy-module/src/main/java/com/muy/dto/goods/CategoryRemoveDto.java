package com.muy.dto.goods;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.muy.Dto;

/**
 * Created by yanglikai on 2017/7/28.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CategoryRemoveDto extends Dto {
    @JsonProperty(value = "category_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
