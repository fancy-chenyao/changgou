package com.changgou.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.changgou.goods.pojo.TbBrand;
import com.changgou.goods.mapper.TbBrandMapper;
import com.changgou.goods.service.TbBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author fancy
 * @since 2020-12-03
 */
@Service
public class TbBrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements TbBrandService {

    @Resource
    private TbBrandMapper brandMapper;
    @Override
    public Page<TbBrand> findAllPage(long current, long limit) {
        Page<TbBrand> conditionPage = new Page<>((current-1) * limit + 1,1);
        Page<TbBrand> brandPage = new Page<>(1,limit);
        QueryWrapper<TbBrand> brandQueryWrapper = new QueryWrapper<>();
        brandQueryWrapper.isNull("gmt_deleted")
                .ge("id",brandMapper.selectPage(conditionPage,new QueryWrapper<TbBrand>().orderByAsc("id")).getRecords().get(0).getId())
                .orderByAsc("id");//按ID升序排列
        brandMapper.selectPage(brandPage,brandQueryWrapper);
        return brandPage;
    }
}
