package com.codeaura.store;

import com.codeaura.store.entities.Address;
import com.codeaura.store.entities.Tag;
import com.codeaura.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//		SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .name("John")
                .password("password")
                .email("gyan@gmail.com")
                .id(1L)
                .build();

        user.addTag( "Tag1");

        System.out.println(user);
    }

}
