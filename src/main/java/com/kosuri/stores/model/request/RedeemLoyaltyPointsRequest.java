package com.kosuri.stores.model.request;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class RedeemLoyaltyPointsRequest {

    @NotNull
    private Date dateOfDiscount;
    private String firstName;
    private String lastName;
    private Double discountAmount;
    private String customerPhone;

    private Double totalSales;

    private Integer loyaltyPoints;

    public Date getDateOfDiscount() {
        return dateOfDiscount;
    }

    public void setDateOfDiscount(Date dateOfDiscount) {
        this.dateOfDiscount = dateOfDiscount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
