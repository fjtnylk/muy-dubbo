package com.muy.service.goods;

import com.muy.DtoList;
import com.muy.dto.goods.CategoryAddDto;
import com.muy.dto.goods.CategoryLoadDto;
import com.muy.dto.goods.CategoryRemoveDto;
import com.muy.dto.goods.CategoryUpdateDto;
import com.muy.exception.CategoryServiceException;
import com.muy.query.goods.*;

import java.util.List;

/**
 * Created by yanglikai on 2017/7/28.
 */
public interface GoodsService {
    CategoryAddDto add4Catagory(CategoryAddQuery query) throws CategoryServiceException;

    CategoryRemoveDto remove4Category(CategoryRemoveQuery query) throws CategoryServiceException;

    CategoryUpdateDto update4Category(CategoryUpdateQuery query) throws CategoryServiceException;

    CategoryLoadDto load4Category(CategoryLoadQuery query) throws CategoryServiceException;

    DtoList<CategoryLoadDto> load4Category(CategoryLoadLevelQuery query) throws CategoryServiceException;

    DtoList<CategoryLoadDto> load4Category(CategoryLoadParentQuery query) throws CategoryServiceException;
}
