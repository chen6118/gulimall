package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.GrowthHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长积分记录表
 * 
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-13 17:13:22
 */
@Mapper
public interface GrowthHistoryDao extends BaseMapper<GrowthHistoryEntity> {
	
}
