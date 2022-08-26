package com.bl.bookstoreapplication.bookrepository;

import com.bl.bookstoreapplication.bookmodel.BookStoreData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookStoreData,Integer> {
    BookStoreData findByBookName(String bookName);
    BookStoreData deleteById(int id);

}
