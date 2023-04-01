package com.kosuri.stores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, StockId> {

    public StockEntity findByMfNameAndItemCodeAndItemNameAndBatchAndSupplierNameAndManufacturerAndStoreId(String mFName, String itemCode, String itemName, String batch, String supplierName, Integer manufacturer, String storeId);

    public List<StockEntity> findByItemNameAndStoreIdAndBalQuantityGreaterThan(String itemName, String storeId, Double balQuantity);
}

