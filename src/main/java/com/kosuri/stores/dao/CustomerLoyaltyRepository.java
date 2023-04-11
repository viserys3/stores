package com.kosuri.stores.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Repository
public interface CustomerLoyaltyRepository extends JpaRepository<CustomerLoyaltyEntity, Integer> {
    public Optional<CustomerLoyaltyEntity> findByCustomerNameAndCustomerPhoneFirstByOrderByDiscountedDateDsc(String customerName, String customerPhone);
}
