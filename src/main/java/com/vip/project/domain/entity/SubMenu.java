package com.vip.project.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubMenu implements Serializable {
    private Integer subMenuId;

    private String menuName;

    private Integer cateId;
}