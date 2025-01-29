package com.jsondb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsondb.domain.User;
import com.jsondb.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsondbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsondbApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserService userService) {
        return args -> {

            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<User>> typeRef = new TypeReference<>() {
            };

            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");

            try {
                List<User> users = objectMapper.readValue(inputStream, typeRef);
                userService.save(users);
                System.out.println("Users saved");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error while saving users");
            }

        };
    }
}
