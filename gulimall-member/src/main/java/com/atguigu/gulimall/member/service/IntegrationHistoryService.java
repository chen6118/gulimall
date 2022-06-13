package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.IntegrationHistoryEntity;

import java.util.Map;

/**
 * 购物积分记录表
 *
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-13 17:13:22
 */
public interface IntegrationHistoryService extends IService<IntegrationHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

