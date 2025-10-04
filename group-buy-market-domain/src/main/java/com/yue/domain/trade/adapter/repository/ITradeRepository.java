package com.yue.domain.trade.adapter.repository;

import com.yue.domain.trade.model.aggregate.GroupBuyOrderAggregate;
import com.yue.domain.trade.model.entity.MarketPayOrderEntity;
import com.yue.domain.trade.model.valobj.GroupBuyProgressVO;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 交易仓储服务接口
 * @create 2025-01-11 09:07
 */
public interface ITradeRepository {

    MarketPayOrderEntity queryMarketPayOrderEntityByOutTradeNo(String userId, String outTradeNo);

    MarketPayOrderEntity lockMarketPayOrder(GroupBuyOrderAggregate groupBuyOrderAggregate);

    GroupBuyProgressVO queryGroupBuyProgress(String teamId);

}
