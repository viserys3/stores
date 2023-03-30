package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
