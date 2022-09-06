package com.bl.bookstoreapplication.book.service;

import com.bl.bookstoreapplication.book.model.BookStoreData;
import com.bl.bookstoreapplication.book.repository.BookRepository;
import com.bl.bookstoreapplication.book.utility.BookStoreDataDto;
import com.bl.bookstoreapplication.genericutlity.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService{

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private Response response;

    @Override
    public Response getAllBooks() {
        return new Response("All books get Succefully",100,bookRepository.findAll());
    }

    @Override
    public Response getBooksById(Integer id) {
        return new Response("Get book by id",100,bookRepository.findById(id));
    }

    @Override
    public Response getBooksByName(String bookName) {
        return new Response("Get by name succefully",100,bookRepository.findByBookName(bookName));
    }

    @Override
    public Response creatNewBook(BookStoreDataDto bookStoreDataDto) {
        BookStoreData bookStoreData = modelMapper.map(bookStoreDataDto,BookStoreData.class);
        bookRepository.save(bookStoreData);
        System.out.println(bookStoreData.toString());
        return new Response("Book adding succefully..",100,bookStoreData);
    }

    @Override
    public Response updateBook(int id, BookStoreDataDto bookStoreDataDto) {
        BookStoreData bookStoreData = modelMapper.map(bookStoreDataDto,BookStoreData.class);
        bookRepository.save(bookStoreData);
        return new Response("Update new book",100,bookStoreData);
    }

    @Override
    public Response deleteBookById(int id) {
        return new Response("Delete book information",100, bookRepository.deleteById(id));
    }

    @Override
    public Response deleteBooksByName(BookStoreDataDto bookStoreDataDto) {
        return null;
    }
}
