package com.springboot.dao;

import com.springboot.bean.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminDao {

    public Admin login(@Param("adminname") String adminname, @Param("password") String password);


}
