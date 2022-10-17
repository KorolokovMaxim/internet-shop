package com.maximkorolokov.internetshop.service;

import com.maximkorolokov.internetshop.DTO.UserDTO;
import com.maximkorolokov.internetshop.entity.user.User;
import com.maximkorolokov.internetshop.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserService {

    UserRepository userRepository;

    public UserDTO get(Long manId){
        Optional<User> user = userRepository.findById(manId);
        return user.map(UserDTO::new).orElse(null);
    }
}
