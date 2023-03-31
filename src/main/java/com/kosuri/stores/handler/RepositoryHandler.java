package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import com.kosuri.stores.dao.UserEntity;
import com.kosuri.stores.dao.UserRepository;
import com.kosuri.stores.model.user.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class RepositoryHandler {
    @Autowired
    private StoreRepository storeRepository;
    @Autowired
    private UserRepository userRepository;

    public void addStoreToRepository(@Valid StoreEntity storeEntity){
        long stores = storeRepository.count();
        System.out.println("fetching repository " + stores);
        try {
            storeRepository.save(storeEntity);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

    public void updateStore(@Valid StoreEntity storeEntity){
        Optional<StoreEntity> store = storeRepository.findById(storeEntity.getId());
        if(store.isEmpty()){
            System.out.println("Entity not found");
            return;
        }
        try {
            storeRepository.save(storeEntity);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

    public void addUser(@Valid UserEntity userEntity){
        if(userRepository.existsByPhoneNumber(userEntity.getPhoneNumber())){
            throw new RuntimeException("Phone number already in system");
        }
        if(userRepository.existsByUsername(userEntity.getUsername())){
            throw new RuntimeException("username already in system");
        }
        try{
            userRepository.save(userEntity);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
