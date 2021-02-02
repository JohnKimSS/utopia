package com.ss.jan21.utopia.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.ss.jan21.utopia.model.Airplane;
import com.ss.jan21.utopia.dao.AirplaneDao;

@Component
public class AirplaneService {

    @Autowired
    AirplaneDao airplaneDao;

    public Airplane getAirplaneById(int airplaneId) {
        return airplaneDao.getAirplaneById(airplaneId);
    }

}
