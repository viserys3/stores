package com.kosuri.stores.handler;

import com.kosuri.stores.dao.RoleEntity;
import com.kosuri.stores.dao.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class RoleHandler {
    @Autowired
    private RoleRepository roleRepository;


    public void createRoleEntityFromRequest(Integer roleId, String roleName){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleId(roleId);
        roleEntity.setRoleName(roleName);


        long roles = roleRepository.count();
        System.out.println("fetching repository " + roles);
        try {
            roleRepository.save(roleEntity);
        }catch(Exception e){
            System.out.println(e.getCause());
        }
    }




    public List<RoleEntity> getAllRoles(){
        List<RoleEntity> roleList = new ArrayList<RoleEntity>();
        roleRepository.findAll().forEach(role -> roleList.add(role));
        return roleList;
    }


}

