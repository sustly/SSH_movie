package com.ly.service;

import java.util.List;

/**
 * @author liyue
 * @date 2018/11/29 9:25
 */
public interface Myservice {
    /**
     * 查找
     *
     * @param hql
     * @param obj
     * @return
     */
    List find(String hql,Object... obj);
}
