package com.ss.jan21.utopia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ss.jan21.utopia.model.Airplane;
import com.ss.jan21.utopia.service.AirplaneService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class AirplaneController {

    @Autowired
    AirplaneService airplaneService;
    // GET routes to get airplane by id or list of all airplanes by admin user
    @RequestMapping(method = RequestMethod.GET, path = "/lms/airplanes/{airplaneId}")
    public Airplane getAirplaneById(@PathVariable int airplaneId) throws ClassNotFoundException, SQLException {
        return airplaneService.getAirplaneById(airplaneId);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/lms/airplanes/")
    public List<Airplane> getAllAirplanes() throws SQLException, ClassNotFoundException {
        return airplaneService.getAllAirplanes();
    }
    // POST routes to add airplane by admin user
    @RequestMapping(method = RequestMethod.POST, path = "lms/airplanes/add-airplane")
    public void createAirplane(Airplane airplane) throws SQLException, ClassNotFoundException {
        airplaneService.createAirplane(airplane);
    }
}
