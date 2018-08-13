package com.pinyougou.sellergoods.Service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @author
 * @date 2018/8/130:02
 */

public interface BrandService {
    /**
     * 查询所有品牌
     * @return
     */
    public List<TbBrand> findAll();
}
