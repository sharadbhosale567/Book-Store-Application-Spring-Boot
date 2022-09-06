package com.bl.bookstoreapplication.book.model;

import com.bl.bookstoreapplication.user.model.Cart;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookStoreData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;
    private String authorName;
    private String prize;
    private int quantity;
    private String bookImage;

    // Relation between books and cart is many to one then use connector
    @ManyToOne(cascade = CascadeType.ALL)
    private Cart cart;
}
