package com.ss.jan21.utopia.service;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.ss.jan21.utopia.model.Airplane;
import com.ss.jan21.utopia.dao.AirplaneDao;
import java.sql.SQLException;
import java.util.List;

@Component
public class AirplaneService {

    @Autowired
    AirplaneDao airplaneDao;

    public Airplane getAirplaneById(int airplaneId) throws ClassNotFoundException, SQLException {
        return airplaneDao.getAirplaneById(airplaneId);
    }

    public List<Airplane> getAllAirplanes() throws SQLException, ClassNotFoundException {
        return airplaneDao.getAllAirplanes();
    }

    public void createAirplane(Airplane airplane) throws SQLException, ClassNotFoundException {
        airplaneDao.createAirplane(airplane);
    }
}
