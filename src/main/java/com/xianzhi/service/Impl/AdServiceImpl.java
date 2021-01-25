package com.xianzhi.service.Impl;

import com.xianzhi.bean.Ad;
import com.xianzhi.dao.AdDao;
import com.xianzhi.dto.AdDto;
import com.xianzhi.service.AdService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * create by foreknow on 2021/1/25
 */
@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdDao adDao;

    @Override
    public List<AdDto> searchByPage(AdDto adDto) {
        List<AdDto> result = new ArrayList<>();
        Ad condition = new Ad();
        //要将AdDto对象中的所有属性copy到Ad对象中
        BeanUtils.copyProperties(adDto,condition);
        //调用dao方法
        List<Ad> adList = adDao.selectIn(condition);
        //要将List<Ad>转化为List<AdDto>
        for (Ad ad:adList) {
            AdDto adDtoTemo = new AdDto();
            BeanUtils.copyProperties(ad,adDtoTemo);
            result.add(adDtoTemo);
        }
        return result;

    }
}
