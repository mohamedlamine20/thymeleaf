package com.example.thymeleaf;

import com.example.thymeleaf.product.Product;
import com.example.thymeleaf.product.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final RestTemplate restTemplate;
    @GetMapping("/home")
    public String home(Model model){
        ResponseEntity<Object[]> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products", Object[].class);

        Object[] objects = forEntity.getBody();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Product> products = Arrays.stream(objects).map(object -> mapper.convertValue(object, Product.class)).collect(Collectors.toList());
        ResponseEntity<Object[]> forEntity1 = restTemplate.getForEntity("https://fakestoreapi.com/users", Object[].class);
        List<User> users = Arrays.stream(forEntity1.getBody()).map(object -> mapper.convertValue(object, User.class)).collect(Collectors.toList());
        model.addAttribute("users",users);
        return "home";
    }
}
