package com.kosuri.stores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByPhoneNumber(String phoneNumber);
    Optional<UserEntity> findByUsernameOrPhoneNumber(String username, String phoneNumber);
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByPhoneNumber(String phoneNumber);
}
