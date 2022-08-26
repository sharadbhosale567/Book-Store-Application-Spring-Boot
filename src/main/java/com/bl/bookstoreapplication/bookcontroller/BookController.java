package com.bl.bookstoreapplication.bookcontroller;

import com.bl.bookstoreapplication.bookservice.BookService;
import com.bl.bookstoreapplication.bookutility.BookStoreDataDto;
import com.bl.bookstoreapplication.bookutility.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/Books")
    public ResponseEntity<Response> getAllBooks(){
        Response response = bookService.getAllBooks();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/Books/{id}")
    public ResponseEntity<Response> getBooksById(@PathVariable int id) {
        Response response = bookService.getBooksById(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("/Books")
    public ResponseEntity<Response> creatBooks(@Valid @RequestBody BookStoreDataDto bookStoreDataDto) {
        Response response = bookService.creatNewBook(bookStoreDataDto);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    @PutMapping("/Books")
    public ResponseEntity<Response> updateBooks(@PathVariable int id,@Valid @RequestBody BookStoreDataDto bookStoreDataDto) {
        Response response = bookService.updateBook(id,bookStoreDataDto);
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/Books/{id}")
    public ResponseEntity<Response> deleteBook(@PathVariable int id) {
        Response response = bookService.deleteBookById(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
