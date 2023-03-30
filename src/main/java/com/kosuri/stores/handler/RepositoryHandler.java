package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RepositoryHandler {
    @Autowired
    private StoreRepository storeRepository;

    public void addStoreToRepository(@Valid StoreEntity storeEntity){
        long stores = storeRepository.count();
        System.out.println("fetching repository " + stores);
        try {
            storeRepository.save(storeEntity);
        }catch(Exception e){
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
        }catch(Exception e){
            System.out.println(e.getCause());
        }
    }
}
