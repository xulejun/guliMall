package com.xlj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xlj.common.utils.PageUtils;
import com.xlj.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-09 16:41:57
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

