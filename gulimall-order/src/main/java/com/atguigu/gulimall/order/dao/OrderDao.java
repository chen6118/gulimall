package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-14 11:02:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
