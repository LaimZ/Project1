package ru.ncedu.vova.photos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private long id;
    private String name;
    
    public User() {}
    
    /*public User(ResultSet rs) throws SQLException {
        this.id = rs.getLong(1);
        this.name = rs.getString(2);
    }*/
    
    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return("name: "+this.getName());
    }
    
}
