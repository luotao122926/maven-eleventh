package com.vip.project.domain.vo;

import com.vip.project.domain.entity.Shop;
import lombok.Data;

import java.util.List;

/**
 * @Author luotao
 */

@Data
public class ShopVo extends Shop {

    private List<ShopVo> shopVoList;

}
