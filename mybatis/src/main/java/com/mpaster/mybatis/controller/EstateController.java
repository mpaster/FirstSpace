package com.mpaster.mybatis.controller;

import com.mpaster.mybatis.entity.Estate;
import com.mpaster.mybatis.service.IEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mpaster on 2016/8/17.
 */

@Controller
public class EstateController {

    @Autowired
    private IEstateService estateService;

    @RequestMapping(value = "getEstateById")
    @ResponseBody
    public Map<String, Object> getEstateById(int id){
        Map<String, Object> map = new HashMap<String, Object>();
        Estate estate = new Estate();
        estate = estateService.getEstateById(String.valueOf(id));
        map.put("estate", estate);
        return map;
    }
}
