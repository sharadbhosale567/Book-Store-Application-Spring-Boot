package com.bl.bookstoreapplication.usermodel;

import com.bl.bookstoreapplication.bookmodel.BookStoreData;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date date;

//    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<BookStoreData> bookStoreData = new ArrayList<>();

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart")
    private BookStoreData bookStoreData;

}
