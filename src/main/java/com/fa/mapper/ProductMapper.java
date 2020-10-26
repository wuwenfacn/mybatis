package com.fa.mapper;

import com.fa.entity.Cate;
import com.fa.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    List<Cate> selectListByCId(@Param("cId") int cId);
    int insert(@Param("product")Product product);
}
