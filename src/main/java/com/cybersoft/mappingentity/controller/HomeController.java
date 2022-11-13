package com.cybersoft.mappingentity.controller;

import com.cybersoft.mappingentity.entity.RestaurantEntity;
import com.cybersoft.mappingentity.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class HomeController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurant")
    public ResponseEntity< List<RestaurantEntity> > getRestaurant() {
        return new ResponseEntity<>(restaurantService.getAllRestaurants(), HttpStatus.OK);
    }
}
