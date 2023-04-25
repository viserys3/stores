package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StockEntity;
import com.kosuri.stores.dao.StockRepository;
import com.kosuri.stores.dao.StoreEntity;
import com.kosuri.stores.dao.StoreRepository;
import com.kosuri.stores.model.Store;
import com.kosuri.stores.model.search.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SearchHandler {

    @Autowired
    StockRepository stockRepository;
    
    @Autowired
    StoreRepository storeRepository;

    public List<SearchResult> search(String medicine, String location) {

        List<SearchResult> searchResultList = new ArrayList<>();

        Optional<List<StoreEntity>> storeList = storeRepository.findByLocationContaining(location);
        if (storeList.isPresent()) {
            for (StoreEntity storeEntity : storeList.get()) {
                List<StockEntity> availableStockEntity = stockRepository.findByItemNameContainingAndStoreIdAndBalQuantityGreaterThan(medicine,
                        storeEntity.getId(), 0D);

                for (StockEntity stockEntity : availableStockEntity) {
                    SearchResult searchResult = new SearchResult();
                    searchResult.setMedicineName(stockEntity.getItemName());
                    searchResult.setMrp(stockEntity.getMrpPack());
                    searchResult.setShopLocation(storeEntity.getLocation());
                    searchResult.setShopName(storeEntity.getName());

                    searchResultList.add(searchResult);
                }
            }
        }

        return searchResultList;
    }
}

