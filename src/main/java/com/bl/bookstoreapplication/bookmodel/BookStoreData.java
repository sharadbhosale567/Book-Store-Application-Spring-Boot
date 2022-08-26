package com.bl.bookstoreapplication.bookmodel;

import com.bl.bookstoreapplication.usermodel.Cart;
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

    @ManyToOne
    private Cart cart;
}
