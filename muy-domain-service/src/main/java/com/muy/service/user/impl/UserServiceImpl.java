package com.muy.service.user.impl;

import com.muy.dto.user.UserLoadDto;
import com.muy.entity.user.UserDO;
import com.muy.exception.UserServiceException;
import com.muy.query.user.UserLoadQuery;
import com.muy.repository.user.UserRepository;
import com.muy.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public UserLoadDto loadByUserName(UserLoadQuery query) throws UserServiceException {
        String userName = query.getUserName();
        UserDO userDO = userRepository.queryByUserName(userName);

        return userDO.parse(UserLoadDto.class);
    }

    @Override
    public UserLoadDto loadByUserId(UserLoadQuery query) throws UserServiceException {
        long userId = query.getUserId();
        UserDO userDO = userRepository.queryByUserId(userId);

        return userDO.parse(UserLoadDto.class);
    }
}
