package com.vip.project.mapper;

import com.vip.project.domain.entity.Banner;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml" , "classpath:spring-mybatis.xml"})
@Slf4j
public class IBannerMapperTest {
    @Resource
    IBannerMapper bannerMapper;

    @Test
    public void getHead() {
        List<Banner> allBanner = bannerMapper.findAllBanner();
        log.debug(allBanner.toString());
    }
}
