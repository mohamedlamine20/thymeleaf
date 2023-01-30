package com.example.thymeleaf.product;


//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
public class Address {
  //  @Id
    private Integer id;
  private String city;
  private String street;
  private Integer number;

  private String zipcode;

  //@OneToOne
  private Geolocation geolocation;



}
