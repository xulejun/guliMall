package com.xlj.gulimall.member.dao;

import com.xlj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xulejun
 * @email xule_jun@163.com
 * @date 2021-01-09 17:04:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
