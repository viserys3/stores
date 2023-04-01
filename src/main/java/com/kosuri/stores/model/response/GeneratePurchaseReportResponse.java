package com.kosuri.stores.model.response;

import com.kosuri.stores.model.purchaseReport.PurchaseReport;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class GeneratePurchaseReportResponse  extends ResponseEntity<GeneratePurchaseReportResponse> {
    private PurchaseReport purchaseReport;
    public GeneratePurchaseReportResponse(HttpStatusCode status) {
        super(status);
    }

    public PurchaseReport getPurchaseReport() {
        return purchaseReport;
    }

    public void setPurchaseReport(PurchaseReport purchaseReport) {
        this.purchaseReport = purchaseReport;
    }
}
