package com.example.thymeleaf.product;

import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
 @AllArgsConstructor
@NoArgsConstructor
@Data
public class Geolocation {

   // @Id
    private Integer id;

    private String  lat	;

    @JsonProperty("long")
    private String longe	;
}
