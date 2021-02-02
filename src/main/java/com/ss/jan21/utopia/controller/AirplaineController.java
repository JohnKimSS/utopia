package com.ss.jan21.utopia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ss.jan21.utopia.model.Airplane;
import com.ss.jan21.utopia.service.AirplaneService;

@RestController
public class AirplaineController {

    @Autowired
    AirplaneService airplaneService;

    @RequestMapping(method = RequestMethod.GET, path = "/lms/airplanes/{airplaneId}")
    public Airplane getAirplaneById(@PathVariable int airplaneId) {
        return airplaneService.getAirplaneById(airplaneId);
    }

}
