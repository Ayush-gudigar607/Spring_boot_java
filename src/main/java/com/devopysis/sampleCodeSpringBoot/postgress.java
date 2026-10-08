package com.devopysis.sampleCodeSpringBoot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


//@Primary
//@Profile("prod")
@Component
@ConditionalOnProperty(name="db.type",havingValue="postgres")
public class postgress  implements  DataBase
{
    @Override
    public void save(String user) {
        System.out.print("Postgress is running "+user);
    }
}
