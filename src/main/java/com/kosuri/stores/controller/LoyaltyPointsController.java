package com.kosuri.stores.controller;

import com.kosuri.stores.handler.LoyaltyPointsHandler;
import com.kosuri.stores.model.request.ConfigureLoyaltyPointsRequest;
import com.kosuri.stores.model.request.CustomerLoyaltyRequest;
import com.kosuri.stores.model.request.RedeemLoyaltyPointsRequest;
import com.kosuri.stores.model.response.ConfigureLoyaltyPointsResponse;
import com.kosuri.stores.model.response.CustomerLoyaltyResponse;
import com.kosuri.stores.model.response.RedeemLoyaltyPointsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/redeem")
    public ResponseEntity<RedeemLoyaltyPointsResponse> redeemLoyaltyPointsResponse(RedeemLoyaltyPointsRequest request) {
        loyaltyPointsHandler.redeemLoyaltyPointsForCustomer(request);
        return null;
    }

    @PostMapping("/checkDiscount")
    public ResponseEntity<CustomerLoyaltyResponse> checkDiscount(CustomerLoyaltyRequest request) {
        try {
            CustomerLoyaltyResponse response = loyaltyPointsHandler.getDiscountForCustomer(request);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            return null;
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }
}
