
package com.devopysis.sampleCodeSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    //for dependency used for DataBase
    private final DataBase dataBase;
    Configurations configurations;

//    @Value("${db.Type}")
//    String Properties;
    //The constructor that injects DataBase.
    public UserService(DataBase dataBase, Configurations configurations)
    {
        this.dataBase=dataBase;
        this.configurations = configurations;
    }

    //save the dataBase
    public void saveUser(String user) {
        System.out.println("UserService is saving user"+"with Properties"+ configurations.getType());
        dataBase.save(user);
    }
}
