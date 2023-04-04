package com.kosuri.stores.controller;

import com.kosuri.stores.handler.ReportHandler;
import com.kosuri.stores.model.request.GeneratePurchaseReportRequest;
import com.kosuri.stores.model.response.GeneratePurchaseReportResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportHandler reportHandler;
    @PostMapping("/generate/purchase")
    public GeneratePurchaseReportResponse generatePurchaseReport(@Valid @RequestBody GeneratePurchaseReportRequest request) throws Exception{
        return reportHandler.generatePurchaseReport(request);
    }
}
