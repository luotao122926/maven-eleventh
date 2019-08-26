package com.vip.project.controller;

import com.vip.project.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml" , "classpath:spring-mybatis.xml"})
@Slf4j
public class FullSearchControllerTest {

    @Resource
    FullSearchController fullSearchController;
    @Test
    public void getFullSearch() {
        Result shops = fullSearchController.getFullSearch("电视机");
        log.debug(shops.toString());
    }
}
