package com.muy.service.goods.impl;

import com.muy.DOList;
import com.muy.DtoList;
import com.muy.dto.goods.CategoryAddDto;
import com.muy.dto.goods.CategoryLoadDto;
import com.muy.dto.goods.CategoryRemoveDto;
import com.muy.dto.goods.CategoryUpdateDto;
import com.muy.entity.goods.CategoryDO;
import com.muy.exception.CategoryServiceException;
import com.muy.query.goods.*;
import com.muy.repository.goods.CategoryRepository;
import com.muy.service.goods.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/7/28.
 */
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private CategoryRepository categoryRepository;

    @Override
    public CategoryAddDto add4Catagory(CategoryAddQuery query) throws CategoryServiceException {
        CategoryDO categoryDO = categoryRepository.add(query);

        return categoryDO.parse(CategoryAddDto.class);
    }

    @Override
    public CategoryRemoveDto remove4Category(CategoryRemoveQuery query) throws CategoryServiceException {
        CategoryDO categoryDO = categoryRepository.remove(query);

        return categoryDO.parse(CategoryRemoveDto.class);
    }

    @Override
    public CategoryUpdateDto update4Category(CategoryUpdateQuery query) throws CategoryServiceException {
        CategoryDO categoryDO = categoryRepository.update(query);

        return categoryDO.parse(CategoryUpdateDto.class);
    }

    @Override
    public CategoryLoadDto load4Category(CategoryLoadQuery query) throws CategoryServiceException {
        long id = query.getId();

        CategoryDO categoryDO = categoryRepository.queryById(id);

        return categoryDO.parse(CategoryLoadDto.class);
    }

    @Override
    public DtoList<CategoryLoadDto> load4Category(CategoryLoadLevelQuery query) throws CategoryServiceException {
        int level = query.getLevel();

        DOList<CategoryDO> categoryDOList = categoryRepository.queryByLevel(level);

        return categoryDOList.parse(CategoryLoadDto.class);
    }

    @Override
    public DtoList<CategoryLoadDto> load4Category(CategoryLoadParentQuery query) throws CategoryServiceException {
        long parentId = query.getParentId();

        DOList<CategoryDO> categoryDOList = categoryRepository.queryByParentId(parentId);

        return categoryDOList.parse(CategoryLoadDto.class);
    }
}
