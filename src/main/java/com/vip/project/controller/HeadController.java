package com.vip.project.controller;

import com.vip.project.service.impl.HeadServiceImpl;
import com.vip.project.utils.HeadAllMsg;
import com.vip.project.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author luotao
 */
@RestController
@RequestMapping("/v1")
public class HeadController {

    @Resource
    HeadServiceImpl headService;

    @RequestMapping("/head")
    public Result head(){
        try{
            HeadAllMsg head = headService.getHead();
            return Result.success(head);
        }catch (Exception e){
            return Result.error();
        }
    }
}
