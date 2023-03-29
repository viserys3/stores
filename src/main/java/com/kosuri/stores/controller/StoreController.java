package com.kosuri.stores.controller;

import java.net.URI;

import com.kosuri.stores.handler.StoreHandler;
import com.kosuri.stores.model.request.CreateStoreRequest;
import com.kosuri.stores.model.response.CreateStoreResponse;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;
@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreHandler storeHandler;
    @PostMapping("/create")
    CreateStoreResponse createStore(CreateStoreRequest request){
        //TODO add call to handler here once logic is ready
        CreateStoreResponse createStoreResponse = new CreateStoreResponse();

        createStoreResponse.setId(storeHandler.addStore(request));
        return createStoreResponse;
    }

}
