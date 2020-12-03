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
    @Transactional
    public Page<TbBrand> findAllPage(long current, long limit, Integer lastId) {
        Page<TbBrand> brandPage = new Page<>(current,limit);
        QueryWrapper<TbBrand> brandQueryWrapper = new QueryWrapper<>();
        brandQueryWrapper.ge("id",lastId).isNull("gmt_deleted")
                .orderByAsc("id");//按ID升序排列
        brandMapper.selectPage(brandPage,brandQueryWrapper);
        return brandPage;
    }
}
