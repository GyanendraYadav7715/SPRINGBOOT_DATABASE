package com.codeaura.store.services;

import com.codeaura.store.entities.User;
import com.codeaura.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public  void showEntityStates(){
        var user = User.builder()
                .name("admin")
                .email("Gayn@gmai.com")
                .password("admin")
                .build();

        if(entityManager.contains(user)){
            System.out.println("Persistence");
            System.out.println("User already exists");
        }
        else{
            System.out.println("Transient/Detached");
            System.out.println("Creating new user");
        }
        userRepository.save(user);
        if(entityManager.contains(user)){
            System.out.println("Persistence");
            System.out.println("User already exists");
        }
        else{
            System.out.println("Transient/Detached");
            System.out.println("Creating new user");
        }
    }
}
