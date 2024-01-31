package models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends ModeloBase{
    private int iduser;
    private String username;
    private String password;
    private Rol rol;

    public User() {
    }


    @Override
    protected String getNombreTabla() {
        return "user";
    }

    @Override
    protected Object createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rol=" + rol +
                '}';
    }
}
