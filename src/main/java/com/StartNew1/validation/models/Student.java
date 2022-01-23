package com.StartNew1.validation.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @NotNull(message = "not be null (isim kısmı boş olamaz!)")
    @Size(min = 3)
    private  String nameSurname;

    @NotBlank(message = "Not be must blank!")
    private String schoolName;

    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 18,message = "Can not be  younger 18 years old")
    private  int age;

    @Pattern(regexp = "[0-9\\s]{12}")
    private  String phone;

}
