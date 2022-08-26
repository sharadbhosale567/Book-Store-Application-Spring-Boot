package com.bl.bookstoreapplication.usercontroller;

import com.bl.bookstoreapplication.userservice.UserService;
import com.bl.bookstoreapplication.userutility.UserResponse;
import com.bl.bookstoreapplication.userutility.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public ResponseEntity<UserResponse> getAllUsers() {
        UserResponse response = userService.getAllUsers();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable int id) {
        UserResponse response = userService.getUsersById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<UserResponse> addUser(@Valid @RequestBody UserDto userDto) {
        UserResponse response = userService.creatNewUsers(userDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<UserResponse> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable int id) {
        UserResponse response = userService.updateUser(id, userDto);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable int id) {
        UserResponse response = userService.deleteUser(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}