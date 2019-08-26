package com.vip.project.service.impl;

import com.vip.project.domain.entity.Shop;
import com.vip.project.mapper.IFullSearchMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml" , "classpath:spring-mybatis.xml"})
@Slf4j
public class FullSearchServiceimplTest {
    @Resource
    IFullSearchMapper fullSearchMapper;
    @Test
    public void searchService() {
        List<Shop> shops = fullSearchMapper.bulrSearch("电视机");
        log.debug(shops.toString());
    }
}
