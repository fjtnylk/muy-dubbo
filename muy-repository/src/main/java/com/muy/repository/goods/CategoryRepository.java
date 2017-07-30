package com.muy.repository.goods;

import com.muy.DOList;
import com.muy.annotation.DbMsEnum;
import com.muy.annotation.SwitchDs;
import com.muy.entity.goods.CategoryDO;
import com.muy.mapper.goods.CategoryMapper;
import com.muy.query.goods.CategoryAddQuery;
import com.muy.query.goods.CategoryRemoveQuery;
import com.muy.query.goods.CategoryUpdateQuery;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yanglikai on 2017/7/28.
 */
@Repository
public class CategoryRepository {
    @Resource
    private CategoryMapper categoryMapper;

    @SwitchDs(ms = DbMsEnum.Slave)
    public CategoryDO queryById(Long categoryId) {
        return categoryMapper.selectById(categoryId);
    }

    @SwitchDs(ms = DbMsEnum.Slave)
    public DOList<CategoryDO> queryByLevel(Integer level) {
        return categoryMapper.selectByLevel(level);
    }

    @SwitchDs(ms = DbMsEnum.Slave)
    public DOList<CategoryDO> queryByParentId(Long parentId) {
        return categoryMapper.selectByParentId(parentId);
    }

    @SwitchDs(ms = DbMsEnum.Master)
    public CategoryDO add(CategoryAddQuery query) {
        CategoryDO target = query.parse(CategoryDO.class);
        categoryMapper.insertSelective(target);
        return target;
    }

    @SwitchDs(ms = DbMsEnum.Master)
    public CategoryDO remove(CategoryRemoveQuery query) {
        CategoryDO target = query.parse(CategoryDO.class);
        categoryMapper.deleteByPrimaryKey(target.getId());
        return target;
    }

    @SwitchDs(ms = DbMsEnum.Master)
    public CategoryDO update(CategoryUpdateQuery query) {
        CategoryDO target = query.parse(CategoryDO.class);
        categoryMapper.updateByPrimaryKeySelective(target);
        return target;
    }
}
