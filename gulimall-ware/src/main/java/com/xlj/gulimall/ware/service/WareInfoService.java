package com.xlj.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xlj.common.utils.PageUtils;
import com.xlj.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-09 17:07:05
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

