package com.sda.orders.orders.services;

import com.sda.orders.orders.model.Users;
import com.sda.orders.orders.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public Users create(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return usersRepository.save(users);
    }
}
