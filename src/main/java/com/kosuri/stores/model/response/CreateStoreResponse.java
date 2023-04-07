package com.kosuri.stores.model.response;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class CreateStoreResponse extends ResponseEntity<CreateStoreResponse> {
    public CreateStoreResponse(HttpStatusCode status) {
        super(status);
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
