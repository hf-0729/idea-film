package com.cache;

import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;

public class RedisCache implements Cache {

    private String namespace;

    public static RedisTemplate template;

    public RedisCache(String namespace){
        this.namespace = namespace;
        System.out.println("有参构造："+namespace);
    }


    @Override
    public String getId() {
        return this.namespace;
    }

    /**
     * 查询后要执行的代码
     * 缓存
     * @param o :方法名参数的拼接
     * @param o1：查出来的对象
     */

    @Override
    public void putObject(Object o, Object o1) {
        System.out.println("查询后执行的代码");
        String key = "com.cache:"+namespace+";"+o.toString().hashCode();
        template.boundValueOps(key).set(o1,7, TimeUnit.DAYS);

    }

    /**
     * 查询前会调用此方法，如果返回null,没有返回，就会去查数据库
     * @param o：区分方法
     * @return
     */

    @Override
    public Object getObject(Object o) {

        System.out.println("查询前调用的方法:"+o);
        String key = "com.cache:"+namespace+":"+o.toString().hashCode();
        Object result = template.boundValueOps(key).get();
        return result;
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    /**
     * 增删改时执行
     */
    @Override
    public void clear() {
        System.out.println("增删改调用的方法");
        Set keys = template.keys("com.cache:"+namespace+":*");
        template.delete(keys);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
