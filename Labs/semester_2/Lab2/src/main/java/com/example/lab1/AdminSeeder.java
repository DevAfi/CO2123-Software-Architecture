package com.example.lab1;

import com.example.lab1.model.User;
import com.example.lab1.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AdminSeeder {

    @Bean
    CommandLineRunner seedAdmin(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String adminUsername = "admin@co2124.com";

            if (userRepository.findByUsername(adminUsername) == null) {
                User admin = new User();
                admin.setUsername(adminUsername);
                admin.setPassword(passwordEncoder.encode("Password"));
                admin.setRole("ADMIN");

                userRepository.save(admin);

                System.out.println("Admin created \nUsername:"+adminUsername+"\nEncrypted Password:"+passwordEncoder.encode("Password"));
            }
        };
    }
}
