package com.kosuri.stores.controller;

import com.kosuri.stores.model.request.GeneratePurchaseReportRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @PostMapping("/generate/purchase")
    public void generatePurchaseReport(@Valid @RequestBody GeneratePurchaseReportRequest request){

    }
}
