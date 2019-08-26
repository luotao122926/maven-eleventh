package com.vip.project.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Category implements Serializable {
    private Integer cateId;

    private String cateName;

    private Integer status;
}