package com.example.springboot2pc.dao.db2;

import com.example.springboot2pc.entity.db2.Test2;

public interface Test2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test2 record);

    int insertSelective(Test2 record);

    Test2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test2 record);

    int updateByPrimaryKey(Test2 record);
}