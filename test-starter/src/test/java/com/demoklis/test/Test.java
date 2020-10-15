package com.demoklis.test;

import com.demoklis.starter.Service;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @Autowired
    private Service service;

    @org.junit.Test
    public void testStarter(){
        System.out.println(service.wrap("aaa"));
    }
}