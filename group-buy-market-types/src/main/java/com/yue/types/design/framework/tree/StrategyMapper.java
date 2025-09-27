/**
 * @description: 策略映射器
 * @author: 29874
 * @date: 2025/9/27 21:47
 */

package com.yue.types.design.framework.tree;

public interface StrategyMapper<T,D,R> {

    StrategyHandler<T,D,R> get(T requestParameter,D dynamicContext);

}
