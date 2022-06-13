package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponSpuCategoryEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-13 10:35:19
 */
public interface CouponSpuCategoryService extends IService<CouponSpuCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

