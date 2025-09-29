package com.yue.domain.activity.adapter.repository;

import com.yue.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.yue.domain.activity.model.valobj.SkuVO;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 活动仓储
 * @create 2024-12-21 10:06
 */
public interface IActivityRepository {

    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(String source, String channel);

    SkuVO querySkuByGoodsId(String goodsId);

}
