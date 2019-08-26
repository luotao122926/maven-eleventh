package com.vip.project.domain.vo;

import com.vip.project.domain.entity.SubMenu;
import com.vip.project.domain.entity.SubMenu1;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author luotao
 */
@Data
public class SubMenuVo extends SubMenu implements Serializable {

    private List<SubMenu1> menu1List;
}
