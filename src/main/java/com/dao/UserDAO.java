package com.dao;

import com.cache.RedisCache;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;
import com.pojo.User;

@CacheNamespace(implementation = RedisCache.class)
public interface UserDAO extends BaseMapper<User> {
}
