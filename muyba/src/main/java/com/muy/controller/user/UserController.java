package com.muy.controller.user;

import com.alibaba.dubbo.rpc.RpcException;
import com.muy.APIResult;
import com.muy.dto.user.UserLoadDto;
import com.muy.exception.UserServiceException;
import com.muy.query.user.UserLoadQuery;
import com.muy.service.user.UserService;
import com.muy.vo.user.UserLoadVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/7/26.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public APIResult getUser(
            @PathVariable(value = "userName") String userName) {
        try {
            UserLoadDto dto = userService.loadByUserName(
                    UserLoadQuery
                            .create()
                            .withUserName(userName));

            UserLoadVO userLoadVO = dto.parse(UserLoadVO.class);
            return APIResult.success(userLoadVO);
        } catch (UserServiceException e) {
            return APIResult.faild(10001, e.getMessage());
        } catch (RpcException e) {
            return APIResult.faild(10002, "注册中心异常!");
        } catch (Exception e) {
            return APIResult.faild(99999, "未捕获异常!");
        }
    }
}
