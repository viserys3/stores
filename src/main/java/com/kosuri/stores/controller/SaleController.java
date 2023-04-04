package com.kosuri.stores.controller;

import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.handler.SaleHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private SaleHandler saleHandler;
    @PostMapping("/import")
    public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws Exception {
        saleHandler.createSaleEntityFromRequest(reapExcelDataFile);
    }
}