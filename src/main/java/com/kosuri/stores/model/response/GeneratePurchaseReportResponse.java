package com.kosuri.stores.model.response;

import com.kosuri.stores.model.purchaseReport.PurchaseReport;
import com.kosuri.stores.model.purchaseReport.PurchaseReportRecord;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class GeneratePurchaseReportResponse  extends GenericResponse {
    private List<PurchaseReportRecord> purchaseReport;

    public List<PurchaseReportRecord> getPurchaseReport() {
        return purchaseReport;
    }

    public void setPurchaseReport(List<PurchaseReportRecord> purchaseReport) {
        this.purchaseReport = purchaseReport;
    }
}
