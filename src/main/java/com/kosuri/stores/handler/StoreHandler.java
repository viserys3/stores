package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import com.kosuri.stores.model.request.CreateStoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class StoreHandler {
    @Autowired
    private RepositoryHandler repositoryHandler;
    public int addStore(CreateStoreRequest createStoreRequest){
        StoreEntity storeEntity = createStoreEntityFromRequest(createStoreRequest);

        repositoryHandler.addStoreToRepository(storeEntity);

        return storeEntity.getId();
    }

    private StoreEntity createStoreEntityFromRequest(CreateStoreRequest createStoreRequest){
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setName(createStoreRequest.getName());
        storeEntity.setId(createStoreRequest.getId());
        storeEntity.setType("PHARMACY");
        storeEntity.setPincode(createStoreRequest.getPincode());
        storeEntity.setPincode(createStoreRequest.getPincode());
        storeEntity.setDistrict(createStoreRequest.getDistrict());
        storeEntity.setState(createStoreRequest.getState());
        storeEntity.setOwner(createStoreRequest.getOwner());
        storeEntity.setOwnerEmail(createStoreRequest.getOwnerEmail());
        storeEntity.setOwnerContact(createStoreRequest.getOnwerContact());
        storeEntity.setSecondaryContact(createStoreRequest.getSecondaryContact());
        storeEntity.setRegistrationDate(LocalDate.now().toString());
        storeEntity.setCreationTimeStamp(LocalDateTime.now().toString());
        storeEntity.setRole("test");
        storeEntity.setModifiedBy("test_user");
        storeEntity.setModifiedDate(LocalDate.now().toString());
        storeEntity.setModifiedTimeStamp(LocalDateTime.now().toString());
        storeEntity.setStatus("OPEN");
        storeEntity.setPassword("test");

        return storeEntity;
    }
}
