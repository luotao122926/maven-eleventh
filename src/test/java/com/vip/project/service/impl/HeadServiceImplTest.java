package com.vip.project.service.impl;

import com.vip.project.mapper.IBannerMapper;
import com.vip.project.utils.HeadAllMsg;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml" , "classpath:spring-mybatis.xml"})
public class HeadServiceImplTest {

    @Resource
    HeadServiceImpl headService;

    @Test
    public void getHead() {
        HeadAllMsg head = headService.getHead();
        log.debug(head.toString());
    }
}
