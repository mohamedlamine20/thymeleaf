package com.example.thymeleaf.product;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rating {
//    @Id
//    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;
    private Double rate;
    private Integer count;
}
