package com.vip.project.mapper;

import com.vip.project.domain.vo.CategoryVo;

import java.util.List;

public interface ICategoryMapper {

    public List<CategoryVo> findAllCate();

    public List<CategoryVo> findAllShop();
}
