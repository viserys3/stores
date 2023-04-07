package com.kosuri.stores.controller;

import com.kosuri.stores.handler.SearchHandler;
import com.kosuri.stores.model.response.SearchResponse;
import com.kosuri.stores.model.search.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class SearchController {

    @Autowired
    SearchHandler searchHandler;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public void search(@RequestParam("medicine") String medicine, @RequestParam("location") String location) {
        List<SearchResult> searchResultList = searchHandler.search(medicine, location);
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setSearchResultList(searchResultList);
        ResponseEntity.status(HttpStatus.OK).body(searchResponse);
    }
}

