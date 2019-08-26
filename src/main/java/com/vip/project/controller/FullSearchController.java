package com.vip.project.controller;

import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.service.impl.FullSearchServiceimpl;
import com.vip.project.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@RestController
@RequestMapping("/v1")
public class FullSearchController {

    @Resource
    FullSearchServiceimpl fullSearchService;

    @RequestMapping("/search")
    public Result getFullSearch(String word){
        try{
            List<Shop> all = fullSearchService.SearchService(word);
            if(all != null && all.size() > 0){
                return Result.success(all);
            }
            return Result.error();
        }catch (Exception e){
            return Result.error();
        }
    }
}
