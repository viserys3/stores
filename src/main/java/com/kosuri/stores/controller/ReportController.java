package com.kosuri.stores.controller;

import com.kosuri.stores.exception.APIException;
import com.kosuri.stores.handler.ReportHandler;
import com.kosuri.stores.model.request.GeneratePurchaseReportRequest;
import com.kosuri.stores.model.request.GenerateSaleReportRequest;
import com.kosuri.stores.model.response.GeneratePurchaseReportResponse;
import com.kosuri.stores.model.response.GenerateSaleReportResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<GeneratePurchaseReportResponse> generatePurchaseReport(@Valid @RequestBody GeneratePurchaseReportRequest request) throws Exception {
        GeneratePurchaseReportResponse response;
        HttpStatus httpStatus;
        try {
           response  = reportHandler.generatePurchaseReport(request);
           response.setResponseMessage("Report Generated!");
           httpStatus = HttpStatus.OK;
        } catch (APIException e) {
            response = new GeneratePurchaseReportResponse();
            httpStatus = HttpStatus.BAD_REQUEST;
            response.setResponseMessage(e.getMessage());
        } catch (Exception e) {
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
            response = new GeneratePurchaseReportResponse();
            response.setResponseMessage(e.getMessage());
        }
        return ResponseEntity.status(httpStatus).body(response);
    }

    @PostMapping("/generate/sale")
    public ResponseEntity<GenerateSaleReportResponse> generateSaleReport(@Valid @RequestBody GenerateSaleReportRequest request) throws Exception {
        GenerateSaleReportResponse response = new GenerateSaleReportResponse();
        HttpStatus httpStatus;
        try {
            response = reportHandler.generateSaleReport(request);
            response.setResponseMessage("Report generated!");
            httpStatus = HttpStatus.OK;
        } catch (APIException e) {
            response.setResponseMessage(e.getMessage());
            httpStatus = HttpStatus.BAD_REQUEST;
        } catch (Exception e) {
            response.setResponseMessage(e.getMessage());
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(httpStatus).body(response);
    }
}
