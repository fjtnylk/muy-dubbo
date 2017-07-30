package com.muy.controller.goods;

import com.muy.APIResult;
import com.muy.DtoList;
import com.muy.VOList;
import com.muy.dto.goods.CategoryAddDto;
import com.muy.dto.goods.CategoryLoadDto;
import com.muy.dto.goods.CategoryRemoveDto;
import com.muy.dto.goods.CategoryUpdateDto;
import com.muy.exception.CategoryServiceException;
import com.muy.query.goods.CategoryAddQuery;
import com.muy.query.goods.CategoryLoadLevelQuery;
import com.muy.query.goods.CategoryRemoveQuery;
import com.muy.query.goods.CategoryUpdateQuery;
import com.muy.service.goods.GoodsService;
import com.muy.vo.goods.CategoryAddVO;
import com.muy.vo.goods.CategoryLoadVO;
import com.muy.vo.goods.CategoryRemoveVO;
import com.muy.vo.goods.CategoryUpdateVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/7/28.
 */
@RestController
@RequestMapping(value = "/v1/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @RequestMapping(value = "/categorys/level/{level}", method = RequestMethod.GET)
    @ResponseBody
    public APIResult getCategoryByLevel(
            @PathVariable("level") Integer level) throws CategoryServiceException {
        DtoList<CategoryLoadDto> dtoList = goodsService.load4Category(
                CategoryLoadLevelQuery
                        .create()
                        .withId(level));

        VOList<CategoryLoadVO> voList = dtoList.parse(CategoryLoadVO.class);

        return APIResult.success(voList);
    }

    @RequestMapping(value = "/categorys", method = RequestMethod.POST)
    @ResponseBody
    public APIResult addCategory(CategoryAddQuery query) throws CategoryServiceException {
        CategoryAddDto dto = goodsService.add4Catagory(query);

        CategoryAddVO vo = dto.parse(CategoryAddVO.class);

        return APIResult.success(vo);
    }

    @RequestMapping(value = "/categorys/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public APIResult removeCategory(CategoryRemoveQuery query) throws CategoryServiceException {
        CategoryRemoveDto dto = goodsService.remove4Category(query);

        CategoryRemoveVO vo = dto.parse(CategoryRemoveVO.class);

        return APIResult.success(vo);
    }

    @RequestMapping(value = "/categorys/{id}", method = RequestMethod.POST)
    @ResponseBody
    public APIResult updateCategory(CategoryUpdateQuery query) throws CategoryServiceException {
        CategoryUpdateDto dto = goodsService.update4Category(query);

        CategoryUpdateVO vo = dto.parse(CategoryUpdateVO.class);

        return APIResult.success(vo);
    }
}
