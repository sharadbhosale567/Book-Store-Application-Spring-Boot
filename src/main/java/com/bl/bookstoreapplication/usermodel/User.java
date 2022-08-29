package com.bl.bookstoreapplication.usermodel;

import com.bl.bookstoreapplication.bookmodel.BookStoreData;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String city;
    private String pinCode;

//    @OneToOne
//    private Cart cart;

//    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
//    private List<BookStoreData> bookStoreData;
//
//    public List<BookStoreData> getBookStoreData() {
//        return bookStoreData;
//    }
//
//    public void setBookStoreData(List<BookStoreData> bookStoreData) {
//        this.bookStoreData = bookStoreData;
//    }

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    private Cart cart;
}
