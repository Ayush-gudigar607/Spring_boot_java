package com.devopysis.sampleCodeSpringBoot;

public class postgress  implements  DataBase{

    @Override
    public void save(String user) {
        System.out.print("Postgress is ,running");
    }
}
