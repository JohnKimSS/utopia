package com.ss.jan21.utopia.dao;

import com.ss.jan21.utopia.model.Airplane;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AirplaneDao extends DbConnect<Airplane> {

    public AirplaneDao(Connection conn) {
        super(conn);
    }


    public void createAirplane(Airplane airplane) throws ClassNotFoundException, SQLException {
        save("insert into airplane (type_id) values (?)", new Object[] { airplane.getAirplaneType().getId() });
    }

    public void updateAirplane(Airplane airplane) throws ClassNotFoundException, SQLException {
        save("update airplane set type_id =? where id = ?",
                new Object[] { airplane.getAirplaneType().getId(), airplane.getId() });
    }

    public void deleteAirplane(Airplane airplane) throws ClassNotFoundException, SQLException {
        save("delete from airplane id = ?", new Object[] { airplane.getId() });
    }

    public List<Airplane> getAllAirplanes() throws ClassNotFoundException, SQLException {
        return read("select * from airplane", null);
    }

    public List<Airplane> getAllAirplanesByType(Integer typeId) throws ClassNotFoundException, SQLException {
        return read("select * from airplane where type_id = ?", new Object[] { typeId });
    }

    public Airplane getAirplaneById(int airplaneId) throws ClassNotFoundException, SQLException {
        return (Airplane) read("select * from airplane where id = ?", new Object[] { airplaneId });
    }

    @Override
    List<Airplane> extractData(ResultSet rs) throws SQLException, ClassNotFoundException {
        List<Airplane> airplanes = new ArrayList<>();
        while (rs.next()) {
            Airplane airplane = new Airplane();
            airplane.getAirplaneType().setId(rs.getInt("type_id"));
            airplane.setId(rs.getInt("id"));

            airplanes.add(airplane);
        }
        return airplanes;
    }
}
