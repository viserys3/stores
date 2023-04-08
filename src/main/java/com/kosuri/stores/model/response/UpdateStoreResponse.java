package com.kosuri.stores.model.response;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class UpdateStoreResponse extends ResponseEntity<UpdateStoreResponse> {
    public UpdateStoreResponse(HttpStatusCode status) {
        super(status);
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
