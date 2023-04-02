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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private SaleHandler saleHandler;
    @PostMapping("/importSale")
    public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
        saleHandler.createSaleEntityFromRequest(reapExcelDataFile);
    }
}