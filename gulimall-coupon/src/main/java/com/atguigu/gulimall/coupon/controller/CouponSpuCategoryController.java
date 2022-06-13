package com.atguigu.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.coupon.entity.CouponSpuCategoryEntity;
import com.atguigu.gulimall.coupon.service.CouponSpuCategoryService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 优惠券分类关联
 *
 * @author CY
 * @email 1186378157@gmail.com
 * @date 2022-06-13 10:35:19
 */
@RestController
@RequestMapping("coupon/couponspucategory")
public class CouponSpuCategoryController {
    @Autowired
    private CouponSpuCategoryService couponSpuCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponSpuCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponSpuCategoryEntity couponSpuCategory = couponSpuCategoryService.getById(id);

        return R.ok().put("couponSpuCategory", couponSpuCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryService.save(couponSpuCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuCategoryEntity couponSpuCategory){
		couponSpuCategoryService.updateById(couponSpuCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponSpuCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}