package com.base.dao.mapper;

import java.util.List;

import com.base.pojo.vo.UserSelectCustom;

public interface UserSelectCustomMapper {
    

    List<UserSelectCustom> selectUserCustomList(UserSelectCustom userSelectCustom) throws Exception;

   
}