package com.vip.project.service.impl;

import com.vip.project.domain.entity.Category;
import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.mapper.IFullSearchMapper;
import com.vip.project.service.IFullSearchService;
import com.vip.project.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@Service("fullSearchService")
public class FullSearchServiceimpl implements IFullSearchService {
    @Resource
    IFullSearchMapper fullSearchMapper;
    @Override
    public List<Shop> SearchService(String word) {
        List<Shop> bulrSearch = fullSearchMapper.bulrSearch(word);
        return bulrSearch;
    }
}
