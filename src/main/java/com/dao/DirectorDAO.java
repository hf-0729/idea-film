package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cache.RedisCache;
import com.pojo.Director;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace(implementation = RedisCache.class)
public interface DirectorDAO extends BaseMapper<Director> {
}
