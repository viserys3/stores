package com.kosuri.stores.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;


@Repository
public interface SaleRepository  extends JpaRepository<SaleEntity, Integer> {

    @Query("Select sum(s.saleValue) from SaleEntity s where s.custName = ?1 and s.date > ?2")
    public Double findTotalSalesForCustomerAfterDate(String customerName, Date date);
}

