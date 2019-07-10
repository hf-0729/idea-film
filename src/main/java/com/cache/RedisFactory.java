package com.cache;

import org.springframework.data.redis.core.RedisTemplate;

public class RedisFactory {

    private RedisTemplate rt;

    public void setRt(RedisTemplate rt){
        this.rt = rt;
        RedisCache.template = this.rt;
    }
}
