package com.ly.dao;

import java.util.List;

/**
 * @author liyue
 * @date 2018/11/27 14:04
 */
public interface Sysdao {

    /**
     * 查找
     *
     * @param hql 查询语句
     * @param obj 参数
     * @return 对象列表 @link{Student}
     */
    List find(String hql, Object... obj);

    /**
     * 保存或更新
     * @param obj 对象
     */
    void saveOrUpdate(Object obj);

    /**
     * 删除
     * @param obj 对象
     */
    void delete(Object obj);
}
