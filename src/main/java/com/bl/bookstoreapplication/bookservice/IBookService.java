package com.bl.bookstoreapplication.bookservice;

import com.bl.bookstoreapplication.bookutility.BookStoreDataDto;
import com.bl.bookstoreapplication.bookutility.Response;

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
