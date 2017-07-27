package com.muy;

import com.muy.dto.user.UserLoadDto;
import com.muy.entity.user.UserDO;
import com.muy.vo.user.UserLoadVO;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class ParseMain {
    public static void main(String[] args) {
        // DO→DTO
        UserDO userDO = new UserDO();
        userDO.setUserId(1000001L);
        userDO.setUserName("yanglikai");
        UserLoadDto userLoadDto = userDO.parse(UserLoadDto.class);
        System.out.println(userLoadDto.toString());
        // DTO→VO
        UserLoadVO userLoadVO = userLoadDto.parse(UserLoadVO.class);
        System.out.println(userLoadVO.toString());
    }
}
