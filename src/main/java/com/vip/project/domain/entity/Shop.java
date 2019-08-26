package com.vip.project.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Shop implements Serializable {
    private Integer shopId;

    private String shopName;

    private String subTitle;

    private BigDecimal originalPrice;

    private BigDecimal promotePrice;

    private Integer stock;

    private Integer cateId;

    private Date createDate;
}