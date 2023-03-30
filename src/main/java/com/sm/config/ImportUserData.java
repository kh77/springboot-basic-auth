package com.sm.config;

import com.sm.entity.Role;
import com.sm.entity.User;
import com.sm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImportUserData implements CommandLineRunner {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void run(String... args) throws Exception {
        userService.create(new User(null, "Ali", bCryptPasswordEncoder.encode("password"), Role.ADMIN));
        userService.create(new User(null, "Hunain", bCryptPasswordEncoder.encode("password"), Role.USER));
        userService.create(new User(null, "Awais", bCryptPasswordEncoder.encode("password"), Role.USER));

    }
}
