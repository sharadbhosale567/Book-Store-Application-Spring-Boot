package com.bl.bookstoreapplication.usermodel;

import com.bl.bookstoreapplication.bookmodel.BookStoreData;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private User user;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "cart")
    private List<BookStoreData> bookStoreData = new ArrayList<BookStoreData>();
}
