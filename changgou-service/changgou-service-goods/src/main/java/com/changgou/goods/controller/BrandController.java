package com.changgou.goods.controller;


import com.changgou.goods.pojo.TbBrand;
import com.changgou.goods.service.TbBrandService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import entity.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author fancy
 * @since 2020-12-03
 */
@Api(value = "品牌管理")
@RestController
@CrossOrigin
@RequestMapping("/changgou_service_goods/brand")
public class BrandController {
    @Resource
    private TbBrandService brandService;

    @ApiOperation(value = "查询全部数据")
    @GetMapping("/findAll/{current}/{limit}")
    @ResponseBody
    R findAll(@PathVariable long current, @PathVariable long limit){
        Page<TbBrand> tbBrandPage = brandService.findAllPage(current,limit);
        long total = tbBrandPage.getTotal();
        List<TbBrand> records = tbBrandPage.getRecords();
        return R.ok().data("total",total).data("rows",records);
    }
}

