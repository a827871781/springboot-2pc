package com.example.springboot2pc.service;

import com.example.springboot2pc.dao.db2.Test2Mapper;
import com.example.springboot2pc.entity.db2.Test2;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.example.springboot2pc.entity.db1.Test1;
import com.example.springboot2pc.dao.db1.Test1Mapper;

import java.util.UUID;

@Service
public class Test1Service{

    @Resource
    private Test1Mapper test1Mapper;

    @Resource
    private Test2Mapper test2Mapper;

    @Transactional
    public int insert() {
        Test2 test2 = new Test2();
        test2.setId(UUID.randomUUID().toString());
        test2.setName("222222");
        test2Mapper.insert(test2);
        Test1 test1 = new Test1();
        test1.setId(UUID.randomUUID().toString());
        test1.setName("11111");
        test1Mapper.insert(test1);
        //控制异常抛出
        //int i = 10 / 0;
        return 0;
    }

    


}
