package com.busreservation.bus_reservation.service;
import org.springframework.stereotype.Service;

import com.busreservation.bus_reservation.entity.User;
import com.busreservation.bus_reservation.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
