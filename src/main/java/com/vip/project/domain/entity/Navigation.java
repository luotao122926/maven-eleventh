package com.vip.project.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Navigation implements Serializable {
    private Integer navId;

    private String navName;

    private Integer status;
}