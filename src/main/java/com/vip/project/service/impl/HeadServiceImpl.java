package com.vip.project.service.impl;

import com.vip.project.domain.entity.Banner;
import com.vip.project.domain.entity.Navigation;
import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.mapper.IBannerMapper;
import com.vip.project.mapper.ICategoryMapper;
import com.vip.project.mapper.INavigationMapper;
import com.vip.project.service.IHeadService;
import com.vip.project.utils.HeadAllMsg;
import com.vip.project.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("headService")
public class HeadServiceImpl implements IHeadService {
    @Resource
    IBannerMapper bannerMapper;
    @Resource
    ICategoryMapper categoryMapper;
    @Resource
    INavigationMapper navigationMapper;
    @Resource
    HeadAllMsg headAllMsg;

    @Override
    public HeadAllMsg getHead() {
        List<Banner> bannerList = bannerMapper.findAllBanner();
        List<CategoryVo> cateList = categoryMapper.findAllCate();
        List<Navigation> navigationList = navigationMapper.findAllNav();
        headAllMsg.setCategoryVoList(cateList);
        headAllMsg.setBannerList(bannerList);
        headAllMsg.setNavigationList(navigationList);
        return headAllMsg;
    }
}
