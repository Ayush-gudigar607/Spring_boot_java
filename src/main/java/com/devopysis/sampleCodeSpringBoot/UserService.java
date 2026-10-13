
package com.devopysis.sampleCodeSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //for dependency used for DataBase
    private final DataBase dataBase;

//    @Value("${db.Type}")
//    String Properties;
    //The constructor that injects DataBase.
    public UserService(DataBase dataBase)
    {
        this.dataBase=dataBase;
    }

    //save the dataBase
    public void saveUser(String user) {
        System.out.println("UserService is saving user"+"with Properties");
        dataBase.save(user);
    }
}
