package com.vip.project.mapper;

import com.vip.project.domain.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IFullSearchMapper {

    public List<Shop> bulrSearch(@Param("word") String word);

}
