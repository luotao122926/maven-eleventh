package com.vip.project.service.impl;

import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.mapper.ICategoryMapper;
import com.vip.project.service.ISortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("sortService")
public class SortServiceImpl implements ISortService {
    @Resource
    ICategoryMapper categoryMapper;

    @Override
    public List<CategoryVo> findAllShop() {
        List<CategoryVo> shop = categoryMapper.findAllShop();
        return shop;
    }
}
