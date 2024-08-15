package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDAO {
    // DAO -> Data Acces Model

    protected Connection connection() throws SQLException {
        return ConnectionDB.getInstance().getConnection();
    };
}
