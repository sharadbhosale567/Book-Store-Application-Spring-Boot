package com.bl.bookstoreapplication.userutility;

import lombok.*;

import javax.validation.constraints.Pattern;

@Getter
@Setter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "User Name = User name Invalid please follow guideline")
    private String name;

//    @Pattern(regexp = "^[7-9]{1}[1-9]{9}" , message = "Please inter valid Phone number")
    private String phoneNumber;

//    @NotBlank(message = "Address filling is mandatory.")
    private String address;

    private String city;

//    @NotNull
//    @Pattern(regexp = "^[1-9]{6}$" , message = "Pincode is only 6 digit..")
    private String pinCode;

}
