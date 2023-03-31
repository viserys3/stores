package com.kosuri.stores.handler;

import com.kosuri.stores.dao.UserEntity;
import com.kosuri.stores.model.request.UserSignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userhandler {
    @Autowired
    private RepositoryHandler repositoryHandler;

    public int signupUser(UserSignUpRequest request){

        UserEntity user = createUserEntityFromRequest(request);

        repositoryHandler.addUser(user);

        return user.getId();
    }

    private UserEntity createUserEntityFromRequest(UserSignUpRequest request){
        UserEntity user = new UserEntity();

        user.setId(request.getId());
        user.setUsername(request.getUserName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setCategory(request.getCategory());
        user.setRole(request.getRole());
        user.setPassword(request.getPassword());
        user.setStatus(request.getStatus());

        return user;
    }
}
