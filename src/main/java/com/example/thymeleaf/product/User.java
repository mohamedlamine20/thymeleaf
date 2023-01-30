package com.example.thymeleaf.product;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
//@Table(name = "user_table")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("email")
   private String   email;
    @JsonProperty("username")
   private String  username	;
    @JsonProperty("password")
   private String password	;

  // @OneToOne
   private Name  name ;
    @JsonProperty("phone")
   private String  phone;
   //@OneToOne
   private Address address;

}
