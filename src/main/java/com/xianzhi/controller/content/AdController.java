package com.xianzhi.controller.content;

import com.xianzhi.bean.Ad;
import com.xianzhi.dao.AdDao;
import com.xianzhi.dto.AdDto;
import com.xianzhi.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * create by foreknow on 2021/1/25
 */
@Controller
@RequestMapping("/ad")
public class AdController {
    @Autowired
    private AdService adService;
    @RequestMapping
    public String init(ModelMap modelMap){
        AdDto adDto = new AdDto();
        modelMap.addAttribute("list",adService.searchByPage(adDto));
        return "/content/adList";
    }



}
