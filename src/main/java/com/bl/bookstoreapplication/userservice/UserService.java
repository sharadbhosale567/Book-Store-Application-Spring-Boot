package com.bl.bookstoreapplication.userservice;

import com.bl.bookstoreapplication.usermodel.User;
import com.bl.bookstoreapplication.userrepository.UserRepository;
import com.bl.bookstoreapplication.userutility.UserResponse;
import com.bl.bookstoreapplication.userutility.UserDto;
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
    private UserResponse response;


    public UserResponse getAllUsers() {
        return new UserResponse("All data", 200, userRepository.findAll());
    }

    @Override
    public UserResponse getUsersById(int id) {
        return new UserResponse("Get user by id",100,userRepository.findById(id));
    }

    public UserResponse creatNewUsers(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        System.out.println(user.toString());
        return new UserResponse("New User added successfully", 100, user);
    }

    public UserResponse updateUser(int id, UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        return new UserResponse("updated user successfully", 100, user);
    }

    @Override
    public UserResponse deleteUsersById(int id) {
        return null;
    }

    public UserResponse deleteUser(int id) {
        return new UserResponse("user deleted", 100, userRepository.deleteById(id));

    }
}