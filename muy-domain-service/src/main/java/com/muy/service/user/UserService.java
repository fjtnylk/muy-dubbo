package com.muy.service.user;

import com.muy.dto.user.UserLoadDto;
import com.muy.exception.UserServiceException;
import com.muy.query.user.UserLoadQuery;

/**
 * Created by yanglikai on 2017/7/26.
 */
public interface UserService {

    UserLoadDto loadByUserName(UserLoadQuery query) throws UserServiceException;

    UserLoadDto loadByUserId(UserLoadQuery query) throws UserServiceException;
}
