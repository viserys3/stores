package com.kosuri.stores.model.response;

import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;

public class UserSignUpResponse {
    @NotNull
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
