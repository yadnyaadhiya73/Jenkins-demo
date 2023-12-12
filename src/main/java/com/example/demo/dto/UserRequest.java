package com.example.demo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {
    @NotNull(message = "name should not be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile no entered")
    private String mobile;
    private String gender;
    @Min(value = 18,message = "invalid age, age should be greater than 18")
    @Max(value = 60,message = "invalid age, age should be less than 60")
    private int age;
    @NotNull
    private String nationality;
}
