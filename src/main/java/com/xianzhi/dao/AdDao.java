package com.xianzhi.dao;

import com.xianzhi.bean.Ad;

import java.util.List;

public interface AdDao {

    /**
     * 查询所有信息
     * @param ad
     * @return
     */
    public Ad selectAll(Ad ad);

    /**
     * 添加广告信息
     * @param ad
     * @return
     */
    public int add(Ad ad);


    /**
     * 根据id查询广告信息
     * @param id
     * @return
     */
     public Ad selectById(int id);


    /**
     * 根据条件查询广告信息
     * 返回list
     * @param ad
     * @return
     */
    public List<Ad> selectIn(Ad ad);


    /**
     * 修改广告信息
     * @param ad
     * @return
     */
    public int update(Ad ad);
}
