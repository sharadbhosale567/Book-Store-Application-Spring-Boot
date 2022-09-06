package com.bl.bookstoreapplication.user.service;

import com.bl.bookstoreapplication.book.repository.BookRepository;
import com.bl.bookstoreapplication.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

//   public Response addBookToCart(int bookId){
//       User user = userRepository.findById(bookId).orElseThrow(()-> new ResourceNotFoundException("User not found"));
//       return new Response();
//   };
}
