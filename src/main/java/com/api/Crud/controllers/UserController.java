package com.api.Crud.controllers;

import com.api.Crud.models.UserModel;
import com.api.Crud.services.UserServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@Api(value="User Management System", description="Operations pertaining to user in User Management System")
public class UserController{

    @Autowired
    private UserServices userServices;

    @GetMapping
    @ApiOperation(value = "View a list of available users", response = List.class)
    public ArrayList<UserModel> getUsers(){
        return this.userServices.getUsers();
    }

    @PostMapping
    @ApiOperation(value = "Add a new user")
    public UserModel saveUsers(@RequestBody UserModel userModel){
        return this.userServices.saveUsers(userModel);
    }

    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Get a user by Id")
    public Optional<UserModel> getUserById(@PathVariable Long id){
        return this.userServices.getById(id);
    }

    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Update a user by Id")
    public UserModel UpdateUserByid(@RequestBody UserModel request, Long id){
        return this.userServices.upDateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Delete a user by Id")
    public String  deleteById(@PathVariable("id") Long id){
        boolean ok = this.userServices.deleteUser(id);

        if (ok ){
            return "User with id " + id + " delete!";
        }else {
            return "Error, we have a problem and can't delete user id " + id;
        }
    }
}

