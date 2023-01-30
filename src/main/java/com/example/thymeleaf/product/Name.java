package com.example.thymeleaf.product;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Name {
   // @Id
    private Integer id;
    private String  firstname	;
    private String  lastname	;
}
