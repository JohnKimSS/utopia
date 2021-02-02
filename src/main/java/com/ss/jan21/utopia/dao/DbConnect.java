package com.ss.jan21.utopia.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 * @author jkim
 *
 */
public abstract class DbConnect<T> {

    protected static Connection conn = null;

    public void save(String query, Object[] vals) throws SQLException, ClassNotFoundException {
        PreparedStatement pStmt = conn.prepareStatement(query);
        if (vals != null) {
            int indx = 1;
            for( Object obj : vals) {
                pStmt.setObject(indx, obj);
                indx++;
            }
        }
        pStmt.execute();
    }

    public List<T> read(String query, Object[] vals) throws SQLException, ClassNotFoundException {
        PreparedStatement pStmt = conn.prepareStatement(query);

        if (vals != null) {
            int indx = 1;
            for( Object obj : vals) {
                pStmt.setObject(indx, obj);
                indx++;
            }
        }
        ResultSet rs = pStmt.executeQuery();
        return extractData(rs);
    }

    abstract List<T> extractData(ResultSet rs) throws SQLException, ClassNotFoundException;

}
