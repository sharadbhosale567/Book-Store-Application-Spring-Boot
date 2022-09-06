package com.bl.bookstoreapplication.user.service;

import com.bl.bookstoreapplication.genericutlity.Response;
import com.bl.bookstoreapplication.user.utility.UserDto;

public interface IUserService {

    Response getAllUsers();
    Response getUsersById(int id);
    Response creatNewUsers(UserDto userDto);
    Response updateUser(int id, UserDto userDto );
    Response deleteUsersById(int id);
}
