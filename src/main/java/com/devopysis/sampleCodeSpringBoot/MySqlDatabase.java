package com.devopysis.sampleCodeSpringBoot;

public class MySqlDatabase implements DataBase {

    @Override
    public void save(String user)
    {
    System.out.print("MySqlDatabase is saving user");
    }
}
