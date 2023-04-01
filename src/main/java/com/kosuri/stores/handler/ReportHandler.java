package com.kosuri.stores.handler;

import com.kosuri.stores.model.purchaseReport.PurchaseReport;
import com.kosuri.stores.model.request.GeneratePurchaseReportRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportHandler {
    @Autowired
    private RepositoryHandler repositoryHandler;

    private PurchaseReport generatePurchaseReport(GeneratePurchaseReportRequest request){

    }
}
