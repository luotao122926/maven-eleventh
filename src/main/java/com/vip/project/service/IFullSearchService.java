package com.vip.project.service;

import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.vo.CategoryVo;

import java.util.List;

public interface IFullSearchService {

    public List<Shop> SearchService(String word);
}
