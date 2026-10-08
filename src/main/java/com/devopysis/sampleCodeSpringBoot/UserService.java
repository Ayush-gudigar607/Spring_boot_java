package com.devopysis.sampleCodeSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    DataBase dataBase;
    //    DataBase dataBase;
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
