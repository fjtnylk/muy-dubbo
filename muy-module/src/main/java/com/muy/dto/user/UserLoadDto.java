package com.muy.dto.user;

import com.muy.Dto;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by yanglikai on 2017/7/26.
 */
public class UserLoadDto extends Dto {
    private Long userId;
    private String userName;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserLoadDto that = (UserLoadDto) o;

        return new EqualsBuilder()
                .append(userId, that.userId)
                .append(userName, that.userName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(userId)
                .append(userName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "UserLoadDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
