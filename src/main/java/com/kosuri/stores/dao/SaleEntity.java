package com.kosuri.stores.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.NotNull;


@Entity
@Table(name = "sales_pharma_detail")
public class SaleEntity {


    @Id
    @Column(name="Doc_Number")
    private String doc_No;
    @Column(name="Read_Doc_Number",nullable = true, length = 45)
    private String readableDocNo;
    @Column(name="Date",nullable = true, length = 45)
    private String date;
    @Column(name="Time",nullable = true, length = 45)
    private String time;
    @Column(name="Cust_Code",nullable = true, length = 45)
    private String custCode;
    @Column(name="Cust_Name",nullable = true, length = 45)
    private String custName;
    @Column(name="Patient_Name",nullable = true, length = 45)
    private String patient;
    @Column(name="Created_User",nullable = true, length = 45)
    private String createdUser;
    @Column(name="Item_Code",nullable = true, length = 45)
    private String itemCode;
    @Column(name="Item_Name",nullable = true, length = 45)
    private String itemName;
    @Column(name="Batch_No",nullable = true, length = 45)
    private String batchNo;
    @Column(name="Exp_Dt",nullable = true, length = 45)
    private String expDt;
    @Column(name="Mfac_Code",nullable = true, length = 45)
    private String mfacCode;
    @Column(name="Mfac_Name",nullable = true, length = 45)
    private String mfacName;
    @Column(name="Cat_Code",nullable = true, length = 45)
    private String catCode;


    @Column(name="Category_Name",nullable = true, length = 45)
    private String categoryName;


    @Column(name="Brand_Name",nullable = true, length = 45)
    private String brandName;
    @Column(name="Packing",nullable = true, length = 45)
    private String packing;
    @Column(name="Qty_Box",nullable = true, length = 45)
    private String qtyBox;
    @Column(name="Qty",nullable = true, length = 45)
    private String qty;
    @Column(name="Sch_Qty",nullable = true, length = 45)
    private String schQty;
    @Column(name="Sch_Disc",nullable = true, length = 45)
    private String schDisc;
    @Column(name="Mrp",nullable = true, length = 45)
    private String mRP;
    @Column(name="Sale_Value",nullable = true, length = 45)
    private String saleValue;
    @Column(name="Disc_Perct",nullable = true, length = 45)
    private String discPer;
    @Column(name="Disc_Value",nullable = true, length = 45)
    private String discValue;
    @Column(name="Taxable_Amt",nullable = true, length = 45)
    private String taxableAmt;
    @Column(name="Cgst_Per",nullable = true, length = 45)
    private String cGSTPer;
    @Column(name="Sgst_Per",nullable = true, length = 45)
    private String sGSTPer;
    @Column(name="Cgst_Amt",nullable = true, length = 45)
    private String cGSTAmt;
    @Column(name="Sgst_Amt",nullable = true, length = 45)
    private String sGSTAmt;
    @Column(name="Igst_Per",nullable = true, length = 45)
    private String iGSTPer;
    @Column(name="Igst_Amt",nullable = true, length = 45)
    private String iGSTAmt;
    @Column(name="Cess_Per",nullable = true, length = 45)
    private String cessPer;
    @Column(name="Cess_Amt",nullable = true, length = 45)
    private String addCessAmt;
    @Column(name="Add_Cess_Per",nullable = true, length = 45)
    private String addCessPer;
    @Column(name="Add_Cess_Amt",nullable = true, length = 45)
    private String cessAmt;
    @Column(name="Total",nullable = true, length = 45)
    private String total;
    @Column(name="Round_Off",nullable = true, length = 45)
    private String roundOff;
    @Column(name="Supp_Bill_No",nullable = true, length = 45)
    private String suppBillNo;
    @Column(name="Supp_Code",nullable = true, length = 45)
    private String suppCode;
    @Column(name="Supp_Name",nullable = true, length = 45)
    private String suppName;
    @Column(name="Professional",nullable = true, length = 45)
    private String professional;
    @Column(name="Mobile",nullable = true, length = 45)
    private String mobile;
    @Column(name="Lc_Code",nullable = true, length = 45)
    private String lccode;


    @Column(name="Pur_Rate",nullable = true, length = 45)
    private String purRate;
    @Column(name="Pur_Rate_With_GST",nullable = true, length = 45)
    private String purRateWithGst;
    @Column(name="Store_ID",nullable = true, length = 45)
    private String storeId;
    @Column(name="Sale_Mode",nullable = true, length = 45)
    private String saleMode;


    public String getSaleMode() {
        return saleMode;
    }


    public void setSaleMode(String saleMode) {
        this.saleMode = saleMode;
    }


    public String getDoc_No() {
        return doc_No;
    }


    public void setDoc_No(String doc_No) {
        this.doc_No = doc_No;
    }


    public String getReadableDocNo() {
        return readableDocNo;
    }


    public void setReadableDocNo(String readableDocNo) {
        this.readableDocNo = readableDocNo;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public String getCustCode() {
        return custCode;
    }


    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }


    public String getCustName() {
        return custName;
    }


    public void setCustName(String custName) {
        this.custName = custName;
    }


    public String getPatient() {
        return patient;
    }


    public void setPatient(String patient) {
        this.patient = patient;
    }


    public String getCreatedUser() {
        return createdUser;
    }


    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }


    public String getItemCode() {
        return itemCode;
    }


    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }


    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getBatchNo() {
        return batchNo;
    }


    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }


    public String getExpDt() {
        return expDt;
    }


    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }


    public String getMfacCode() {
        return mfacCode;
    }


    public void setMfacCode(String mfacCode) {
        this.mfacCode = mfacCode;
    }


    public String getMfacName() {
        return mfacName;
    }


    public void setMfacName(String mfacName) {
        this.mfacName = mfacName;
    }


    public String getCatCode() {
        return catCode;
    }


    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }


    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public String getBrandName() {
        return brandName;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getPacking() {
        return packing;
    }


    public void setPacking(String packing) {
        this.packing = packing;
    }


    public String getQtyBox() {
        return qtyBox;
    }


    public void setQtyBox(String qtyBox) {
        this.qtyBox = qtyBox;
    }


    public String getQty() {
        return qty;
    }


    public void setQty(String qty) {
        this.qty = qty;
    }


    public String getSchQty() {
        return schQty;
    }


    public void setSchQty(String schQty) {
        this.schQty = schQty;
    }


    public String getSchDisc() {
        return schDisc;
    }


    public void setSchDisc(String schDisc) {
        this.schDisc = schDisc;
    }


    public String getmRP() {
        return mRP;
    }


    public void setmRP(String mRP) {
        this.mRP = mRP;
    }


    public String getSaleValue() {
        return saleValue;
    }


    public void setSaleValue(String saleValue) {
        this.saleValue = saleValue;
    }


    public String getDiscPer() {
        return discPer;
    }


    public void setDiscPer(String discPer) {
        this.discPer = discPer;
    }


    public String getDiscValue() {
        return discValue;
    }


    public void setDiscValue(String discValue) {
        this.discValue = discValue;
    }


    public String getTaxableAmt() {
        return taxableAmt;
    }


    public void setTaxableAmt(String taxableAmt) {
        this.taxableAmt = taxableAmt;
    }


    public String getcGSTPer() {
        return cGSTPer;
    }


    public void setcGSTPer(String cGSTPer) {
        this.cGSTPer = cGSTPer;
    }


    public String getsGSTPer() {
        return sGSTPer;
    }


    public void setsGSTPer(String sGSTPer) {
        this.sGSTPer = sGSTPer;
    }


    public String getcGSTAmt() {
        return cGSTAmt;
    }


    public void setcGSTAmt(String cGSTAmt) {
        this.cGSTAmt = cGSTAmt;
    }


    public String getsGSTAmt() {
        return sGSTAmt;
    }


    public void setsGSTAmt(String sGSTAmt) {
        this.sGSTAmt = sGSTAmt;
    }


    public String getiGSTPer() {
        return iGSTPer;
    }


    public void setiGSTPer(String iGSTPer) {
        this.iGSTPer = iGSTPer;
    }


    public String getiGSTAmt() {
        return iGSTAmt;
    }


    public void setiGSTAmt(String iGSTAmt) {
        this.iGSTAmt = iGSTAmt;
    }


    public String getCessPer() {
        return cessPer;
    }


    public void setCessPer(String cessPer) {
        this.cessPer = cessPer;
    }


    public String getAddCessAmt() {
        return addCessAmt;
    }


    public void setAddCessAmt(String addCessAmt) {
        this.addCessAmt = addCessAmt;
    }


    public String getAddCessPer() {
        return addCessPer;
    }


    public void setAddCessPer(String addCessPer) {
        this.addCessPer = addCessPer;
    }


    public String getCessAmt() {
        return cessAmt;
    }


    public void setCessAmt(String cessAmt) {
        this.cessAmt = cessAmt;
    }


    public String getTotal() {
        return total;
    }


    public void setTotal(String total) {
        this.total = total;
    }


    public String getRoundOff() {
        return roundOff;
    }


    public void setRoundOff(String roundOff) {
        this.roundOff = roundOff;
    }


    public String getSuppBillNo() {
        return suppBillNo;
    }


    public void setSuppBillNo(String suppBillNo) {
        this.suppBillNo = suppBillNo;
    }


    public String getSuppCode() {
        return suppCode;
    }


    public void setSuppCode(String suppCode) {
        this.suppCode = suppCode;
    }


    public String getSuppName() {
        return suppName;
    }


    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }


    public String getProfessional() {
        return professional;
    }


    public void setProfessional(String professional) {
        this.professional = professional;
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getLccode() {
        return lccode;
    }


    public void setLccode(String lccode) {
        this.lccode = lccode;
    }


    public String getPurRate() {
        return purRate;
    }


    public void setPurRate(String purRate) {
        this.purRate = purRate;
    }


    public String getPurRateWithGst() {
        return purRateWithGst;
    }


    public void setPurRateWithGst(String purRateWithGst) {
        this.purRateWithGst = purRateWithGst;
    }


    public String getStoreId() {
        return storeId;
    }


    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
}

