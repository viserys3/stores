package com.kosuri.stores.handler;

import com.kosuri.stores.dao.LoyaltyEntity;
import com.kosuri.stores.dao.LoyaltyRepository;
import com.kosuri.stores.model.request.ConfigureLoyaltyPointsRequest;
import com.kosuri.stores.model.response.ConfigureLoyaltyPointsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoyaltyPointsHandler {

    @Autowired
    LoyaltyRepository loyaltyRepository;

    public ConfigureLoyaltyPointsResponse configureLoyaltyPoints(ConfigureLoyaltyPointsRequest request) {
        LoyaltyEntity loyaltyEntity = new LoyaltyEntity();
        loyaltyEntity.setStoreId(request.getStoreId());
        loyaltyEntity.setSalesVolume(request.getSalesVolume());
        loyaltyEntity.setLoyaltyPoints(request.getLoyaltyPoints());
        loyaltyEntity.setFixedDiscountPercentage(request.getFixedDiscountPercentage());
        loyaltyEntity.setMinLoyaltyPoints(request.getMinLoyaltyPoints());

        Double totalSalesVolume = request.getMinLoyaltyPoints()*(request.getSalesVolume()/request.getLoyaltyPoints());
        Double totalDiscountPercentage = request.getMinLoyaltyPoints()/100D;
        Double totalDiscount = totalSalesVolume * totalDiscountPercentage;
        loyaltyEntity.setTotalSalesVolume(totalSalesVolume);

        loyaltyRepository.save(loyaltyEntity);

        ConfigureLoyaltyPointsResponse response = new ConfigureLoyaltyPointsResponse();
        response.setTotalSalesVolume(totalSalesVolume);
        response.setTotalDiscount(totalDiscount);

        return response;
    }
}
