package com.kosuri.stores.handler;


import com.kosuri.stores.dao.StockEntity;
import com.kosuri.stores.dao.StockRepository;
import com.kosuri.stores.exception.APIException;
import com.kosuri.stores.model.enums.StockUpdateRequestType;
import com.kosuri.stores.model.request.StockUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StockHandler {

    @Autowired
    StockRepository stockRepository;

    public void updateStock(StockUpdateRequest stockUpdateRequest) {

        StockEntity stock = stockRepository.findByMfNameAndItemNameAndBatchAndStoreId(
                stockUpdateRequest.getMfName(), stockUpdateRequest.getItemName(), stockUpdateRequest.getBatch(), stockUpdateRequest.getStoreId());

        if (stock != null) {
            Double currBalLooseQuantity;
            Double currBalPackQuantity;
            Double curBalQuantity = stock.getBalQuantity();

            if (stockUpdateRequest.getStockUpdateRequestType() == StockUpdateRequestType.PURCHASE) {
                curBalQuantity += stockUpdateRequest.getPackQuantity() * stockUpdateRequest.getQtyPerBox()
                + stockUpdateRequest.getBalLooseQuantity();
            } else {
                curBalQuantity -= stockUpdateRequest.getBalLooseQuantity();
            }

            currBalPackQuantity = curBalQuantity/stockUpdateRequest.getQtyPerBox();
            currBalLooseQuantity = curBalQuantity - (currBalPackQuantity * stockUpdateRequest.getQtyPerBox());

            Double stockValueMrp = currBalPackQuantity * stockUpdateRequest.getMrpPack() + currBalLooseQuantity * (stockUpdateRequest.getMrpPack()/stockUpdateRequest.getQtyPerBox());
            Double purRatePerPackAfterGST = stock.getPurRatePerPackAfterGST();
            Double stockValuePurRate = currBalPackQuantity * purRatePerPackAfterGST + currBalLooseQuantity * (purRatePerPackAfterGST/stockUpdateRequest.getQtyPerBox());

            stock.setBalPackQuantity(currBalPackQuantity);
            stock.setBalLooseQuantity(currBalLooseQuantity);
            stock.setBalQuantity(curBalQuantity);
            stock.setMrpPack(stockUpdateRequest.getMrpPack());
            stock.setStockValueMrp(stockValueMrp);
            stock.setStockValuePurrate(stockValuePurRate);
            stock.setUpdatedBy("");
            stock.setUpdatedAt(LocalDateTime.now());
            stockRepository.save(stock);

        } else {

//            if (stockUpdateRequest.getStockUpdateRequestType() == StockUpdateRequestType.SALE) {
//                throw APIException("Pur")
//            }
            StockEntity s = new StockEntity();
            s.setItemName(stockUpdateRequest.getItemName());
            s.setBatch(stockUpdateRequest.getBatch());
            s.setManufacturer(stockUpdateRequest.getManufacturer());
            s.setMfName(stockUpdateRequest.getMfName());
            s.setSupplierName(stockUpdateRequest.getSupplierName());
            s.setItemCode(stockUpdateRequest.getItemCode());
            s.setBalLooseQuantity(stockUpdateRequest.getBalLooseQuantity());
            s.setBalPackQuantity(stockUpdateRequest.getPackQuantity());
            s.setBalQuantity(stockUpdateRequest.getPackQuantity() * stockUpdateRequest.getQtyPerBox() + stockUpdateRequest.getBalLooseQuantity());
            s.setExpiryDate(stockUpdateRequest.getExpiryDate());
            s.setOnlineYesNo("Yes");
            s.setStoreId(stockUpdateRequest.getStoreId());
            s.setMrpPack(stockUpdateRequest.getMrpPack());
            if (stockUpdateRequest.getStockUpdateRequestType() == StockUpdateRequestType.PURCHASE) {
                s.setPurRatePerPackAfterGST(stockUpdateRequest.getTotalPurchaseValueAfterGST()/stockUpdateRequest.getQtyPerBox());
            }

            s.setStockValueMrp(stockUpdateRequest.getPackQuantity() * stockUpdateRequest.getMrpPack()
            + stockUpdateRequest.getBalLooseQuantity() * (stockUpdateRequest.getMrpPack()/stockUpdateRequest.getQtyPerBox()));

            s.setStockValuePurrate(stockUpdateRequest.getPackQuantity() * s.getPurRatePerPackAfterGST()
                    + stockUpdateRequest.getBalLooseQuantity() * (s.getPurRatePerPackAfterGST()/stockUpdateRequest.getQtyPerBox()));
            stock.setUpdatedBy("");
            stock.setUpdatedAt(LocalDateTime.now());
            stockRepository.save(s);
        }

    }
}


