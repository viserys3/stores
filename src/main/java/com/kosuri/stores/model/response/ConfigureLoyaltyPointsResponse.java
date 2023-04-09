package com.kosuri.stores.model.response;

public class ConfigureLoyaltyPointsResponse {
    private Double totalSalesVolume;
    private Double totalDiscount;

    public void setTotalSalesVolume(Double totalSalesVolume) {
        this.totalSalesVolume = totalSalesVolume;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
}
