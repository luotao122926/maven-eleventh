package com.vip.project.utils;

import com.vip.project.domain.entity.Banner;
import com.vip.project.domain.entity.Navigation;
import com.vip.project.domain.vo.CategoryVo;
import com.vip.project.domain.vo.SubMenuVo;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * 封装头部信息的实体类
 * @Author luotao
 */
@Data
@Component
public class HeadAllMsg implements Serializable {

    private List<CategoryVo> categoryVoList;

    private List<Banner> bannerList;

    private List<Navigation> navigationList;

}
