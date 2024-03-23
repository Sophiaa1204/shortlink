package com.sophia.shortlink.admin.config;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RBloomFilterConfiguration {

    /**
     * tryInit 有两个核心参数：
     * ● expectedInsertions：预估布隆过滤器存储的元素长度。
     * ● falseProbability：运行的误判率。
     * 错误率越低，位数组越长，布隆过滤器的内存占用越大。
     * 错误率越低，散列 Hash 函数越多，计算耗时较长。
     */
    @Bean
    public RBloomFilter<String> userRegisterCachePenetrationBloomFilter(RedissonClient redissonClient) {
        RBloomFilter<String> cachePenetrationBloomFilter = redissonClient.getBloomFilter("userRegisterCachePenetrationBloomFilter");
        cachePenetrationBloomFilter.tryInit(100000000L,0.001);
        return cachePenetrationBloomFilter;
    }
}
