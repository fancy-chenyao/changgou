package com.changgou.goods.service;

import com.changgou.goods.pojo.TbBrand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author fancy
 * @since 2020-12-03
 */
public interface TbBrandService extends IService<TbBrand> {

    Page<TbBrand> findAllPage(long current, long limit);
}
