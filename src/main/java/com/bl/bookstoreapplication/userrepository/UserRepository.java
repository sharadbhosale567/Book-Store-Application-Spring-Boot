package com.bl.bookstoreapplication.userrepository;

import com.bl.bookstoreapplication.usermodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User deleteById(int id);
}
