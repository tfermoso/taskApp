package controller;

import models.User;

public class TaskController {
    private User userLogged;
    public boolean createUser(String username,String pass,int rol){
        User user=new User();
        return user.insertar("(username,password,idrol) values (?,?,?)",username,pass,rol);

    }
}
