package com.kosuri.stores.model.response;

import com.kosuri.stores.model.purchaseReport.PurchaseReportRecord;
import com.kosuri.stores.model.purchaseReport.SaleReportRecord;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class GenerateSaleReportResponse extends GenericResponse {
    private List<SaleReportRecord> saleReport;
    public List<SaleReportRecord> getPurchaseReport() {
        return saleReport;
    }

    public void setSaleReport(List<SaleReportRecord> saleReport) {
        this.saleReport = saleReport;
    }
}
