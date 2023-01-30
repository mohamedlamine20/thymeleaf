package com.example.thymeleaf.product;

//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
public class Product {
  //  @Id
    private  Integer id;
    private String title;
    private Double price;

    private String description;

    private String category;
    private String image;

  //  @OneToOne(cascade = CascadeType.ALL)
    private Rating rating;
}
