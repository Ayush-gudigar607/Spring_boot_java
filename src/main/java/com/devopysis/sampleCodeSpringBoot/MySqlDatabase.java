package com.devopysis.sampleCodeSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Profile("dev")
@Component
@ConditionalOnProperty(name="db.type",havingValue="mysql")


public class MySqlDatabase implements DataBase {

    @Override
    public void save(String user)
    {
    System.out.print("MySqlDatabase is saving user");
    }
}
