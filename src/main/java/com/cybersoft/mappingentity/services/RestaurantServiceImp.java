package com.cybersoft.mappingentity.services;

import com.cybersoft.mappingentity.entity.RestaurantEntity;
import com.cybersoft.mappingentity.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImp implements RestaurantService{
    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
