package com.kosuri.stores.controller;

import com.kosuri.stores.handler.PurchaseHandler;
import com.kosuri.stores.handler.RepositoryHandler;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private PurchaseHandler purchaseHandler;
    @PostMapping("/import")
    public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile,
                                     @RequestParam("store_id") String storeId) throws Exception {
        purchaseHandler.createPurchaseEntityFromRequest(reapExcelDataFile, storeId);
    }


}
