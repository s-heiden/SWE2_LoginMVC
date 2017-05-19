package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserLoginModel {
   
    private final StringProperty username;
    private final StringProperty password;
    
    public UserLoginModel(String username, String password){
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
    }
    
    public boolean validate(){
        return (username.get().equals("username") &&
                password.get().equals("password"));
    }
    
    
}
