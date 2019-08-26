package com.vip.project.controller;

import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.service.impl.SortServiceImpl;
import com.vip.project.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author luotao
 */
@RestController
@RequestMapping("/v1")
public class SortController {

    @Resource
    SortServiceImpl sortService;

    @RequestMapping("/sort")
    public Result getSort(){
        try{
            List<CategoryVo> shop = sortService.findAllShop();
            return Result.success(shop);
        }catch (Exception e){
            return  Result.error();
        }
    }
}
