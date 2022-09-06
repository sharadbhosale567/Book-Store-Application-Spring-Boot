package com.bl.bookstoreapplication.user.controller;

import com.bl.bookstoreapplication.genericutlity.Response;
import com.bl.bookstoreapplication.user.service.MailSenderService;
import com.bl.bookstoreapplication.user.service.UserService;
import com.bl.bookstoreapplication.user.utility.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MailSenderService mailSenderService;

    @GetMapping("/sendEmail")
    public String sendEmail() {
        return mailSenderService.sendEmail();
    }

    // mail send with attachment for any text file or other file
   /* @GetMapping("/sendEmailsWithAttachment")
    public String sendEmailsWithAttachment() {
        return mailSenderService.sendEmailsWithAttachment();
    }*/


    @GetMapping("/users")
    public ResponseEntity<Response> getAllUsers() {
        Response response = userService.getAllUsers();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Response> getUserById(@PathVariable int id) {
        Response response = userService.getUsersById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<Response> addUser(@Valid @RequestBody UserDto userDto) {
        Response response = userService.creatNewUsers(userDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Response> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable int id) {
        Response response = userService.updateUser(id, userDto);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable int id) {
        Response response = userService.deleteUser(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}