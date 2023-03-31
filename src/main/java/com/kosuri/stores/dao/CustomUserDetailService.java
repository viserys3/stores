package com.kosuri.stores.dao;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private UserRepository userRepository;

    public void CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsernameOrPhoneNumber(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with username or phone: "+ usernameOrEmail));

        GrantedAuthority authorities = new SimpleGrantedAuthority(user.getRole());

        return new org.springframework.security.core.userdetails.User(user.getPhoneNumber(),
                user.getPassword(),
                Collections.singleton(authorities));
    }
}
}
