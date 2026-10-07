package com.devopysis.sampleCodeSpringBoot;

public class UserService {
    DataBase dataBase;
    public UserService(DataBase dataBase)
    {
      this.dataBase=dataBase;
    }
    public void saveUser(String user)
    {
        System.out.println("UserService is saving user");
        dataBase.save(user);
    }
}
