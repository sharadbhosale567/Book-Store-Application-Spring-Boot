package com.bl.bookstoreapplication.bookutility;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.constraints.*;

@Data
//@ToString
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ControllerAdvice
public class BookStoreDataDto {

//    @NotBlank(message = "Book name not empty..")
    private String bookName;

    private String authorName;
//    @NotBlank
    private String prize;
//    @NotBlank
    private int quantity;

    private String bookImage;
}
