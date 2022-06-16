package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-16 09:45:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
