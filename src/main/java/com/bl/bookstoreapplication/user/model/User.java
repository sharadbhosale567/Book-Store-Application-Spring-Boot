package com.bl.bookstoreapplication.user.model;

import lombok.*;
import javax.persistence.*;

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


    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    private Cart cart;
}
