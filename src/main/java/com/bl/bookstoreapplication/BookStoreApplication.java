package com.bl.bookstoreapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Books Store Application..");
        SpringApplication.run(BookStoreApplication.class, args);
    }
}
