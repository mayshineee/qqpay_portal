package com.base.dao.mapper;

import com.base.pojo.po.User_Status;
import com.base.pojo.po.User_StatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_StatusMapper {
    int countByExample(User_StatusExample example);

    int deleteByExample(User_StatusExample example);

    int deleteByPrimaryKey(String id);

    int insert(User_Status record);

    int insertSelective(User_Status record);

    List<User_Status> selectByExample(User_StatusExample example);

    User_Status selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User_Status record, @Param("example") User_StatusExample example);

    int updateByExample(@Param("record") User_Status record, @Param("example") User_StatusExample example);

    int updateByPrimaryKeySelective(User_Status record);

    int updateByPrimaryKey(User_Status record);
}