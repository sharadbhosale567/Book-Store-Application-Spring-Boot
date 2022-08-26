package com.bl.bookstoreapplication.userservice;

import com.bl.bookstoreapplication.userutility.UserResponse;
import com.bl.bookstoreapplication.userutility.UserDto;

public interface IUserService {

    UserResponse getAllUsers();
    UserResponse getUsersById(int id);
    UserResponse creatNewUsers(UserDto userDto);
    UserResponse updateUser(int id, UserDto userDto );
    UserResponse deleteUsersById(int id);
}
