package com.kosuri.stores.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository  extends JpaRepository<RoleEntity, Integer> {
    public Optional<RoleEntity> findByRoleName(String roleName);
}

