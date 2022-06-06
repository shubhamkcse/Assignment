package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number")
    private String mobile;
    @Email(message = "invalid email id")
    private String email;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
}
