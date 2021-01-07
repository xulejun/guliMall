package com.xlj;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xlj.gulimall.product.GulimallProductApplication;
import com.xlj.gulimall.product.entity.BrandEntity;
import com.xlj.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {
    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "xlj"));
        list.forEach(key -> {
            System.out.println(key);
        });
    }

}
