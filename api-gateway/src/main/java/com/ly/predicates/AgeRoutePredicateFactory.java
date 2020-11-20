package com.ly.predicates;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author White Liu
 * @Description 自定义路由断言器
 * @Date 2020/10/21 11:10
 * @Version 1.0
 */
@Component
public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {
    //构造函数
    public AgeRoutePredicateFactory(){
        super(AgeRoutePredicateFactory.Config.class);
    }

    //读取配置文件中的参数值，并赋值给配置类中的属性上
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("minAge","maxAge");
    }
    public Predicate<ServerWebExchange> apply(final Config config) {
        return (serverWebExchange)->{
                String ageStr = serverWebExchange.getRequest().getQueryParams().getFirst("age");
                if(StringUtils.isNotEmpty(ageStr)){
                    int age = Integer.parseInt(ageStr);
                    if(age<config.getMaxAge()&&age>config.getMinAge()){
                        return true;
                    }
                }
                return false;
        };
    }
    @Data
    @NoArgsConstructor
    public static class Config{
        private int minAge;
        private int maxAge;
    }
}
