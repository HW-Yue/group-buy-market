/**
 * @description: 策略映射器
 * @author: 29874
 * @date: 2025/9/27 21:47
 */

package com.yue.types.design.framework.tree;

public interface StrategyMapper<T, D, R> {

    /**
     * 获取待执行策略
     *
     * @param requestParameter 入参
     * @param dynamicContext   上下文
     * @return 返参
     * @throws Exception 异常
     */
    StrategyHandler<T, D, R> get(T requestParameter, D dynamicContext) throws Exception;

}
