package com.ss.jan21.utopia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.ss.jan21.utopia.model.Airplane;
import com.ss.jan21.utopia.service.AirplaneService;

@RestController
public class AirplaineController {

    @Autowired
    AirplaneService airplaneService;

    public Airplane getAirplaneById(int id) {
        return airplaneService.getAirplaneById(id);
    }

}
