package com.busreservation.bus_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busreservation.bus_reservation.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
