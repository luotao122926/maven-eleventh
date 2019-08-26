package com.vip.project.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class Banner implements Serializable {
    private Integer bannerId;

    private String title;

    private String image;

    private String detailUrl;

    private Integer order;

    private Date createTime;

    /**
     * 1表示正常 0表示下架
     */
    private Integer status;
}