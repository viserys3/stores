package com.kosuri.stores.controller;

import com.kosuri.stores.handler.PurchaseHandler;
import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.model.response.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<GenericResponse> mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile,
                                                               @RequestParam("store_id") String storeId,  @RequestParam("email_id") String emailId) {
        GenericResponse response = new GenericResponse();
        try {
            purchaseHandler.createPurchaseEntityFromRequest(reapExcelDataFile, storeId, emailId);
            response.setResponseMessage("Successfully uploaded the file!");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (IOException e) {
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        } catch (Exception e) {
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }


}
