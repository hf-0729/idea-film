package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cache.RedisCache;
import com.pojo.Session;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace(implementation = RedisCache.class)
public interface SessionDAO extends BaseMapper<Session> {
}
