package com.base.dao.mapper;

import com.base.pojo.po.Role_Power;
import com.base.pojo.po.Role_PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_PowerMapper {
    int countByExample(Role_PowerExample example);

    int deleteByExample(Role_PowerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Role_Power record);

    int insertSelective(Role_Power record);

    List<Role_Power> selectByExample(Role_PowerExample example);

    Role_Power selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Role_Power record, @Param("example") Role_PowerExample example);

    int updateByExample(@Param("record") Role_Power record, @Param("example") Role_PowerExample example);

    int updateByPrimaryKeySelective(Role_Power record);

    int updateByPrimaryKey(Role_Power record);
}