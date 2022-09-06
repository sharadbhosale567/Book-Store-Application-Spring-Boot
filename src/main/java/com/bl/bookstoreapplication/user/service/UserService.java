package com.bl.bookstoreapplication.user.service;

import com.bl.bookstoreapplication.genericutlity.Response;
import com.bl.bookstoreapplication.user.model.User;
import com.bl.bookstoreapplication.user.repository.UserRepository;
import com.bl.bookstoreapplication.user.utility.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private Response response;
    public Response getAllUsers() {
        return new Response("All data", 200, userRepository.findAll());
    }

    @Override
    public Response getUsersById(int id) {
        return new Response("Get user by id",100,userRepository.findById(id));
    }

    public Response creatNewUsers(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        System.out.println(user.toString());
        return new Response("New User added successfully", 100, user);
    }

    public Response updateUser(int id, UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        return new Response("updated user successfully", 100, user);
    }

    @Override
    public Response deleteUsersById(int id) {
        return null;
    }

    public Response deleteUser(int id) {
        return new Response("user deleted", 100, userRepository.deleteById(id));

    }
}