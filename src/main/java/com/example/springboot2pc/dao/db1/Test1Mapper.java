package com.example.springboot2pc.dao.db1;

import com.example.springboot2pc.entity.db1.Test1;

public interface Test1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    Test1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
}