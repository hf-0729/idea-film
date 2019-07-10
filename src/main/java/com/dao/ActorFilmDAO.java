package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cache.RedisCache;
import com.pojo.ActorFilm;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace(implementation = RedisCache.class)
public interface ActorFilmDAO extends BaseMapper<ActorFilm> {
}
