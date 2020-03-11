package com.jt.manage.mapper;

import com.jt.manage.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	//查询全部数据
	List<User> findAll();
}
