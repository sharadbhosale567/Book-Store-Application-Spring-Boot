package com.bl.bookstoreapplication.book.service;

import com.bl.bookstoreapplication.book.utility.BookStoreDataDto;
import com.bl.bookstoreapplication.genericutlity.Response;

public interface IBookService {

    //getAll
    Response getAllBooks();
    //get
    Response getBooksById(Integer id);
    //getByName
    Response getBooksByName(String bookName);
    //post
    Response creatNewBook(BookStoreDataDto bookStoreDataDto);
    //update
    Response updateBook(int id, BookStoreDataDto bookStoreDataDto);
    //delete
    Response deleteBookById(int id);
    //deleteByName
    Response deleteBooksByName(BookStoreDataDto bookStoreDataDto);
}
