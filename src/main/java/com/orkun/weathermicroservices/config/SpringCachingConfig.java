package com.orkun.weathermicroservices.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.orkun.weathermicroservices.constant.Constants.WEATHER_CACHE_NAME;

@Configuration
@EnableCaching
public class SpringCachingConfig {

    @Bean
    public CacheManager SpringCachingConfig(){
        return new ConcurrentMapCacheManager(WEATHER_CACHE_NAME);
    }
}
