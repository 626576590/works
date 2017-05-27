package com.test.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.app.vo.User;

//@Mapper
public interface UserMapper {

	//@Select("select * from user")
	List<User> findUser();
	
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);
    
    User findAccount(String account);
    
    User findTelephone(String telephone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
