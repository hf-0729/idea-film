package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cache.RedisCache;
import com.pojo.Myorder;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace(implementation = RedisCache.class)
public interface MyorderDAO extends BaseMapper<Myorder> {
}
