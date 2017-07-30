package com.muy.mapper.goods;

import com.muy.DOList;
import com.muy.entity.goods.CategoryDO;
import com.muy.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yanglikai on 2017/7/28.
 */
@Repository
public interface CategoryMapper extends MyMapper<CategoryDO> {

    CategoryDO selectById(
            @Param("categoryId") Long categoryId);

    DOList<CategoryDO> selectByLevel(
            @Param("level") Integer level);

    DOList<CategoryDO> selectByParentId(
            @Param("parentId") Long parentId);
}
