package com.zsj.service;

import com.zsj.entity.User;
import com.zsj.mappers.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IBM on 2016/8/18.
 */
@Service
public class UserService  {

    private UserMapper userMapper;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }


    @Transactional
    public User checkUser(String username,String password){
        SqlSession session = this.getSession();
        userMapper= session.getMapper(UserMapper.class);
        User user =userMapper.checkUser(username,password);
        session.commit();
        session.close();
        return user;
        }

        }
