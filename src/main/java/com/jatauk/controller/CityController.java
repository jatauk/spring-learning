package com.jatauk.controller;

import com.jatauk.dao.entitty.City;
import com.jatauk.dao.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CityController {
    
    @Autowired
    CityRepository cityRepository;
    
    @RequestMapping(name = "/city", method = RequestMethod.POST)
    @ResponseBody
    public String getCity(@RequestParam("name") String cityName) {
        City city = cityRepository.findByName(cityName);
        if (city == null) {
            return "null";
        } else {
            return city.toString();
        }
    }
}