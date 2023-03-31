package com.kosuri.stores.controller;

import com.kosuri.stores.handler.Userhandler;
import com.kosuri.stores.model.request.UserSignUpRequest;
import com.kosuri.stores.model.response.UserSignUpResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    Userhandler userhandler;
    @PostMapping("/signup")
    public ResponseEntity<UserSignUpResponse> signUp(@Valid @RequestBody RequestEntity<UserSignUpRequest>request){
        UserSignUpResponse userSignUpResponse = new UserSignUpResponse();

        userSignUpResponse.setId(userhandler.signupUser(request.getBody()));

        return new ResponseEntity<>(userSignUpResponse, HttpStatus.OK) ;
    }

}
