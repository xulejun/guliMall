package com.xlj.gulimall.member.feign;

import com.xlj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xlj
 * @date 2021/1/11 20:47
 */

/**
 * 告诉spring cloud这个接口是一个远程客户端，要调用coupon服务，再去调用coupon服务/coupon/coupon/member/list对应的方法
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 注意写全优惠券类上还有映射
     * 注意我们这个地方不熟控制层，所以这个请求映射请求的不是我们服务器上的东西，而是nacos注册中心的
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();//得到一个R对象
}