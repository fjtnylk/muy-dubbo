package com.muy.query.user;

import com.muy.Query;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class UserLoadQuery extends Query {
    private Long userId;
    private String userName;

    public UserLoadQuery() {
    }

    public static UserLoadQuery create() {
        return new UserLoadQuery();
    }

    public UserLoadQuery withUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public UserLoadQuery withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
