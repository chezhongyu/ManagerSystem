package com.xianzhi.service;

import com.xianzhi.dto.AdDto;

import java.util.List;

public interface AdService {
    /***
     * 根据条件查询信息
     * @param adDto 查询条件
     * @return List<AdDto>
     */
    public List<AdDto> searchByPage(AdDto adDto);
}
