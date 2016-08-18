package com.zsj.mappers;

import com.zsj.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by IBM on 2016/8/18.
 */
@Repository
public interface UserMapper {
    User checkUser(@Param("username") String username, @Param("password") String password);
}
