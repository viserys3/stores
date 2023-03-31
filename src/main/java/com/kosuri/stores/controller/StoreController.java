package com.kosuri.stores.controller;

import com.kosuri.stores.handler.StoreHandler;
import com.kosuri.stores.model.request.CreateStoreRequest;
import com.kosuri.stores.model.request.UpdateStoreRequest;
import com.kosuri.stores.model.response.CreateStoreResponse;
import com.kosuri.stores.model.response.UpdateStoreResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreHandler storeHandler;

    @PostMapping("/create")
    ResponseEntity<CreateStoreResponse> createStore(@Valid @RequestBody RequestEntity<CreateStoreRequest> request) {
        CreateStoreResponse createStoreResponse = new CreateStoreResponse();

        createStoreResponse.setId(storeHandler.addStore(request.getBody()));
        return new ResponseEntity<> (createStoreResponse,HttpStatus.OK);
    }

    @PostMapping("/update")
    ResponseEntity<UpdateStoreResponse> updateStore(@Valid @RequestBody RequestEntity<UpdateStoreRequest> request) {
        UpdateStoreResponse updateStoreResponse = new UpdateStoreResponse();

        updateStoreResponse.setId(storeHandler.updateStore(request.getBody()));
        return new ResponseEntity<>(updateStoreResponse, HttpStatus.OK);
    }
}
