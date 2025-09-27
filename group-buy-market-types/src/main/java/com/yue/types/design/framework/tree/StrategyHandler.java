/**
 * @description: 策略处理器
 * @author: 29874
 * @date: 2025/9/27 21:49
 */

package com.yue.types.design.framework.tree;

public interface StrategyHandler <T,D,R>{

    StrategyHandler DEFAULT = (T,D) ->null;

    R apply(T requestParameter,D dynamicContext) throws Exception;


}
