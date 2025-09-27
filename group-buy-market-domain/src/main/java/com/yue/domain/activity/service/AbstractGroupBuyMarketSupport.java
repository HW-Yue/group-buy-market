/**
 * @description:抽象的拼团营销支撑类
 * @author: 29874
 * @date: 2025/9/27 22:27
 */

package com.yue.domain.activity.service;

import com.yue.domain.activity.model.entity.MarketProductEntity;
import com.yue.domain.activity.model.entity.TrialBalanceEntity;
import com.yue.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.yue.types.design.framework.tree.AbstractStrategyRouter;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity>
        extends AbstractStrategyRouter<com.yue.domain.activity.model.entity.MarketProductEntity
                , DefaultActivityStrategyFactory.DynamicContext, com.yue.domain.activity.model.entity.TrialBalanceEntity> {

}
