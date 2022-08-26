package com.bl.bookstoreapplication.userutility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserResponse {

    private String responseMessage;
    private Integer responseStatus;
    private Object responseData;
}
