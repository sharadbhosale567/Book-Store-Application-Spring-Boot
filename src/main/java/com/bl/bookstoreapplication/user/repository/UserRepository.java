package com.bl.bookstoreapplication.user.repository;

import com.bl.bookstoreapplication.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User deleteById(int id);
}
