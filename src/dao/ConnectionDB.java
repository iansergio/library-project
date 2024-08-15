package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static ConnectionDB instance;
    private ConnectionDB(){};

    public synchronized static ConnectionDB getInstance(){
        if(instance == null){
            instance = new ConnectionDB();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:meu_banco.db";
        return DriverManager.getConnection(url);
    }
}
