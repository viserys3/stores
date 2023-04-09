package com.kosuri.stores.controller;

import com.kosuri.stores.handler.LoyaltyPointsHandler;
import com.kosuri.stores.model.request.ConfigureLoyaltyPointsRequest;
import com.kosuri.stores.model.response.ConfigureLoyaltyPointsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/loyalty/points")
public class LoyaltyPointsController {

    @Autowired
    LoyaltyPointsHandler loyaltyPointsHandler;

    @PostMapping("/configure")
    public ResponseEntity<ConfigureLoyaltyPointsResponse> configureLoyaltyPoints(ConfigureLoyaltyPointsRequest request) throws Exception {
        ConfigureLoyaltyPointsResponse response = loyaltyPointsHandler.configureLoyaltyPoints(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
