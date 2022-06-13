package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-13 10:35:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
