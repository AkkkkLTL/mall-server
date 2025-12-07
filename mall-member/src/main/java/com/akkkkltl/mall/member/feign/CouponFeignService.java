package com.akkkkltl.mall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akkkkltl.common.utils.R;

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
