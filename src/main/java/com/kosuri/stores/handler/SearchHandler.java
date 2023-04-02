package com.kosuri.stores.handler;

import com.kosuri.stores.dao.StockEntity;
import com.kosuri.stores.dao.StockRepository;
import com.kosuri.stores.model.search.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SearchHandler {

    @Autowired
    StockRepository stockRepository;
    
    @Autowired
    StoreRepository storeRepository;

    public List<SearchResult> search(String medicine, String location) {
        
        List<String> storeIds = new ArrayList<>();
        List<SearchResult> searchResultList = new ArrayList<>();

        for (String storeId: storeIds) {
            List<StockEntity> availableStockEntity = stockRepository.findByItemNameAndStoreIdAndBalQuantityGreaterThan(medicine, storeId, 0D);

            for(StockEntity stockEntity : availableStockEntity) {
                SearchResult searchResult = new SearchResult();
                searchResult.setMedicineName(stockEntity.getItemName());
                searchResult.setMrp(stockEntity.getMrpPack());

                searchResultList.add(searchResult);
//                searchResult.setShopLocation(stock.get);
            }
        }

        return searchResultList;

    }
}

