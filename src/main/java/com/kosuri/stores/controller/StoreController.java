package com.kosuri.stores.controller;

import com.kosuri.stores.handler.StoreHandler;
import com.kosuri.stores.model.request.CreateStoreRequest;
import com.kosuri.stores.model.request.UpdateStoreRequest;
import com.kosuri.stores.model.response.CreateStoreResponse;
import com.kosuri.stores.model.response.UpdateStoreResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    CreateStoreResponse createStore(@Valid @RequestBody CreateStoreRequest request) {
        CreateStoreResponse createStoreResponse = new CreateStoreResponse(HttpStatus.OK);

        createStoreResponse.setId(storeHandler.addStore(request));
        return createStoreResponse;
    }

    @PostMapping("/update")
    UpdateStoreResponse updateStore(@Valid @RequestBody UpdateStoreRequest request) {
        UpdateStoreResponse updateStoreResponse = new UpdateStoreResponse(HttpStatus.OK);

        updateStoreResponse.setId(storeHandler.updateStore(request));
        return updateStoreResponse;
    }
}
