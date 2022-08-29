package com.bl.bookstoreapplication.bookmodel;

import com.bl.bookstoreapplication.usermodel.Cart;
import com.bl.bookstoreapplication.usermodel.User;
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

//    @ManyToOne(cascade = CascadeType.ALL)
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Cart cart;
}
