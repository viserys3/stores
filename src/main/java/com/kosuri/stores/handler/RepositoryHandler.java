package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RepositoryHandler {
    @Autowired
    private StoreRepository storeRepository;

    public void addStoreToRepository(StoreEntity storeEntity){
        storeRepository.save(storeEntity);
    }
}
