package com.kosuri.stores.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface SaleRepository  extends JpaRepository<SaleEntity, Integer> {
    Optional<List<SaleEntity>> findByStoreId(String storeId);
}

