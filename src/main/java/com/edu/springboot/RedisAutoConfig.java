package com.edu.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;

@Configuration
@ConditionalOnClass(Jedis.class)
@EnableConfigurationProperties(RedisProperties.class)  //这个类需要用到这个properties 类
public class RedisAutoConfig {
	@Bean
	@ConditionalOnMissingBean //没有才装配
	public Jedis jedis(RedisProperties redisProperties){
		return new Jedis(redisProperties.getHost(),redisProperties.getPort());
	}
}
