package com.kosuri.stores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, StockId> {

    public StockEntity findByMfNameAndItemNameAndBatchAndStoreId(String mFName, String itemName, String batch, String storeId);

    public List<StockEntity> findByItemNameContainingAndStoreIdAndBalQuantityGreaterThan(String itemName, String storeId, Double balQuantity);
}

