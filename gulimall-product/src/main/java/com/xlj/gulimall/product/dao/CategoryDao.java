package com.xlj.gulimall.product.dao;

import com.xlj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-07 22:38:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
