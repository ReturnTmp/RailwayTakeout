package com.itheima.railway.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

/**
 * redis缓存管理器配置类
 */
@Configuration
public class MyRedisCacheManager {
    /**
     * 30分钟过期的Redis缓存管理器
     *
     * @param connectionFactory Redis连接工厂
     * @return Redis缓存管理器
     */
    @Bean
    @Primary    // 加入这个注解表示默认使用
    public RedisCacheManager redisCacheManager30M(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration config = initRedisCacheConfig(30L);
        return RedisCacheManager.builder(connectionFactory).cacheDefaults(config).build();
    }

    /**
     * 1小时过期的Redis缓存管理器
     *
     * @param connectionFactory Redis连接工厂
     * @return Redis缓存管理器
     */
    @Bean
    public RedisCacheManager redisCacheManager1H(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration config = initRedisCacheConfig(60L);
        return RedisCacheManager.builder(connectionFactory).cacheDefaults(config).build();
    }

    /**
     * 5分钟失效的Redis缓存管理器
     *
     * @param connectionFactory Redis连接工厂
     * @return Redis缓存管理器
     */
    @Bean
    public RedisCacheManager redisCacheManager5M(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration config = initRedisCacheConfig(5L);
        return RedisCacheManager.builder(connectionFactory).cacheDefaults(config).build();
    }

    /**
     * 初始化Redis缓存配置
     *
     * @param minute 分钟
     * @return Redis缓存配置
     */
    private RedisCacheConfiguration initRedisCacheConfig(Long minute) {
        return RedisCacheConfiguration.defaultCacheConfig()
                // 设置缓存的默认过期时间(min)
                .entryTtl(Duration.ofMinutes(minute))
                // 不缓存空值
                .disableCachingNullValues()
                // 覆盖默认的构造key，否则会多出一个冒号 原规则：cacheName::key  现规则：cacheName:key
                .computePrefixWith(name -> name + ":");
    }
}
