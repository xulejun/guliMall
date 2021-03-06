package com.xlj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xlj.common.utils.PageUtils;
import com.xlj.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-09 16:41:57
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

