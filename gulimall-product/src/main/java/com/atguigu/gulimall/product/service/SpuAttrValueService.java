package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-08 15:03:26
 */
public interface SpuAttrValueService extends IService<SpuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

