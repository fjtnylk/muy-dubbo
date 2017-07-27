package com.muy.repository.user;

import com.muy.annotation.DbMsEnum;
import com.muy.annotation.SwitchDs;
import com.muy.entity.user.UserDO;
import com.muy.mapper.user.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by yanglikai on 2017/7/26.
 */
@Repository
public class UserRepository {
    @Resource
    private UserMapper userMapper;

    @SwitchDs(ms = DbMsEnum.Slave)
    public UserDO queryByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @SwitchDs(ms = DbMsEnum.Slave)
    public UserDO queryByUserId(Long userId) {
        return userMapper.selectByUserId(userId);
    }
}
