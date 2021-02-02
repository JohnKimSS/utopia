package com.ss.jan21.utopia.dao;

import com.ss.jan21.utopia.model.Airplane;
import org.springframework.stereotype.Component;

@Component
public class AirplaneDao {

    public Airplane getAirplaneById(int airplaneId) {
        Airplane airplane = new Airplane();
        airplane.setAirplaneId(airplaneId);
        airplane.setAirplaneType("type"+airplaneId);
        return airplane;
    }
}
