package com.muy.mapper.user;

import com.muy.entity.user.UserDO;
import com.muy.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yanglikai on 2017/7/26.
 */
@Repository
public interface UserMapper extends MyMapper<UserDO> {

    UserDO selectByUserName(
            @Param("userName") String userName);

    UserDO selectByUserId(
            @Param("userId") Long userId);
}
