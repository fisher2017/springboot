package com.zqh.springboot.demo.mapper;

import com.zqh.springboot.demo.model.User;

<<<<<<< HEAD
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);
=======
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
>>>>>>> origin/master

    int insert(User record);

    int insertSelective(User record);

<<<<<<< HEAD
    User selectByPrimaryKey(Integer userId);
=======
    User selectByPrimaryKey(Integer id);
>>>>>>> origin/master

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
<<<<<<< HEAD

    List<User> selectAllUser();
=======
>>>>>>> origin/master
}