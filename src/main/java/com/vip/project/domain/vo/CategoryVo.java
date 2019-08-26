package com.vip.project.domain.vo;

import com.vip.project.domain.entity.Category;
import com.vip.project.domain.entity.Shop;
import com.vip.project.domain.entity.SubMenu;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author luotao
 */
@Data
public class CategoryVo extends Category implements Serializable {

    public List<SubMenu> menuList;

    public List<Shop> shopList;
}
