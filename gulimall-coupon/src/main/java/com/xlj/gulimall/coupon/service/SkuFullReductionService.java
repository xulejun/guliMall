package com.xlj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xlj.common.utils.PageUtils;
import com.xlj.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-09 16:41:57
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

