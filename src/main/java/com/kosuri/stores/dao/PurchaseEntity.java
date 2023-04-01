package com.kosuri.stores.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pharma_purchase_detail")
public class PurchaseEntity{


    @Id
    @Column(name="Doc_Number")
    private Integer doc_Number;


    @Column(name="Ref_Doc_Number",nullable = true, length = 45)
    private String readableDocNo;
    @Column(name = "Date")
    private String date;


    @Column(name="Bill_No",nullable = true, length = 45)
    private String billNo;


    @Column(name="Bill_Date",nullable = true, length = 45)
    private String billDt;
    @Column(name="Item_Code",nullable = true, length = 45)
    private String itemCode;
    @Column(name="Item_Name",nullable = true, length = 45)
    private String itemName;
    @Column(name="Batch_Number",nullable = true, length = 45)
    private String batchNo;
    @Column(name="Expiry_Date",nullable = true, length = 45)
    private String expiryDate;
    @Column(name="Cat_Code",nullable = true, length = 45)
    private String catCode;


    @Column(name="Cat_Name",nullable = true, length = 45)
    private String catName;
    @Column(name="Mfac_Code",nullable = true, length = 45)
    private String mfacCode;
    @Column(name="Mfac_Name",nullable = true, length = 45)
    private String mfacName;
    @Column(name="Brand_Name",nullable = true, length = 45)
    private String brandName;
    @Column(name="Packing",nullable = true, length = 45)
    private String packing;
    @Column(name="DC_Year",nullable = true, length = 45)
    private String dcYear;
    @Column(name="DC_Prefix",nullable = true, length = 45)
    private String dcPrefix;
    @Column(name="DC_Year",nullable = true, length = 45)
    private String dcSrno;
    @Column(name="Qty_Box",nullable = true, length = 45)
    private String qty;
    @Column(name="Pack_Qty",nullable = true, length = 45)
    private String packQty;
    @Column(name="Loose_Qty",nullable = true, length = 45)
    private String looseQty;
    @Column(name="Sch_Pack_Qty",nullable = true, length = 45)
    private String schPackQty;
    @Column(name="Sch_Loose_Qty",nullable = true, length = 45)
    private String schLooseQty;
    @Column(name="Sch_Disc",nullable = true, length = 45)
    private String schDisc;
    @Column(name="Sch_Rate",nullable = true, length = 45)
     private String SaleRate;
    @Column(name="Pur_Rate",nullable = true, length = 45)
    private String purRate;
    @Column(name="Mrp",nullable = true, length = 45)
    private String mRP;
    @Column(name="Purchase_Value",nullable = true, length = 45)
    private String purValue;
    @Column(name="Disc_Per",nullable = true, length = 45)
    private String discPer;
    @Column(name="Margin",nullable = true, length = 45)
    private String margin;
    @Column(name="Supp_Code",nullable = true, length = 45)
    private String suppCode;
    @Column(name="Supp_Name",nullable = true, length = 45)
    private String suppName;
    @Column(name="Disc",nullable = true, length = 45)
    private String discValue;
    @Column(name="Taxable_Amt",nullable = true, length = 45)
    private String taxableAmt;
    @Column(name="Gst_Code",nullable = true, length = 45)
    private String gstCode;
    @Column(name="Cgst",nullable = true, length = 45)
    private String cGSTPer;
    @Column(name="Sgst",nullable = true, length = 45)
    private String sGSTPer;
    @Column(name="Cgst_Amt",nullable = true, length = 45)
    private String cGSTAmt;
    @Column(name="Sgst_Amt",nullable = true, length = 45)
    private String sGSTAmt;
    @Column(name="Igst",nullable = true, length = 45)
    private String iGSTPer;
    @Column(name="Total",nullable = true, length = 45)
    private String total;
    @Column(name="Post",nullable = true, length = 45)
    private String post;
    @Column(name="Item_Category",nullable = true, length = 45)
    private String itemCat;


    @Column(name="Cess_Per",nullable = true, length = 45)
    private String cessPer;
    @Column(name="Cess_Amt",nullable = true, length = 45)
    private String cessAmt;

    public String getItemCat() {
        return itemCat;
    }


    public void setItemCat(String itemCat) {
        this.itemCat = itemCat;
    }
    public void setSaleRate(String saleRate) {
        this.SaleRate = saleRate;
    }

    public String getSaleRate(String saleRate) {
        return this.SaleRate;
    }


    public void set(String itemCat) {
        this.itemCat = itemCat;
    }

    public Long getDoc_Number() {
        return doc_Number;
    }


    public void setDoc_Number(Long doc_Number) {
        this.doc_Number = doc_Number;
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


    public String getBillNo() {
        return billNo;
    }


    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }


    public String getBillDt() {
        return billDt;
    }


    public void setBillDt(String billDt) {
        this.billDt = billDt;
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


    public String getExpiryDate() {
        return expiryDate;
    }


    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    public String getCatCode() {
        return catCode;
    }


    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }


    public String getCessPer() {
        return cessPer;
    }


    public void setCessPer(String cessPer) {
        this.cessPer = cessPer;
    }


    public String getCessAmt() {
        return cessAmt;
    }


    public void setCessAmt(String cessAmt) {
        this.cessAmt = cessAmt;
    }


    public String getCatName() {
        return catName;
    }


    public void setCatName(String catName) {
        this.catName = catName;
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


    public String getDcYear() {
        return dcYear;
    }


    public void setDcYear(String dcYear) {
        this.dcYear = dcYear;
    }


    public String getDcPrefix() {
        return dcPrefix;
    }


    public void setDcPrefix(String dcPrefix) {
        this.dcPrefix = dcPrefix;
    }


    public String getDcSrno() {
        return dcSrno;
    }


    public void setDcSrno(String dcSrno) {
        this.dcSrno = dcSrno;
    }


    public String getQty() {
        return qty;
    }


    public void setQty(String qty) {
        this.qty = qty;
    }


    public String getPackQty() {
        return packQty;
    }


    public void setPackQty(String packQty) {
        this.packQty = packQty;
    }


    public String getLooseQty() {
        return looseQty;
    }


    public void setLooseQty(String looseQty) {
        this.looseQty = looseQty;
    }


    public String getSchPackQty() {
        return schPackQty;
    }


    public void setSchPackQty(String schPackQty) {
        this.schPackQty = schPackQty;
    }


    public String getSchLooseQty() {
        return schLooseQty;
    }


    public void setSchLooseQty(String schLooseQty) {
        this.schLooseQty = schLooseQty;
    }


    public String getSchDisc() {
        return schDisc;
    }


    public void setSchDisc(String schDisc) {
        this.schDisc = schDisc;
    }


    public String getPurRate() {
        return purRate;
    }


    public void setPurRate(String purRate) {
        this.purRate = purRate;
    }


    public String getmRP() {
        return mRP;
    }


    public void setmRP(String mRP) {
        this.mRP = mRP;
    }


    public String getPurValue() {
        return purValue;
    }


    public void setPurValue(String purValue) {
        this.purValue = purValue;
    }


    public String getDiscPer() {
        return discPer;
    }


    public void setDiscPer(String discPer) {
        this.discPer = discPer;
    }


    public String getMargin() {
        return margin;
    }


    public void setMargin(String margin) {
        this.margin = margin;
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


    public String getGstCode() {
        return gstCode;
    }


    public void setGstCode(String gstCode) {
        this.gstCode = gstCode;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

// getters and setters
}


