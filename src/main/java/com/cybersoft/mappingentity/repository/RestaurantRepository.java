package com.cybersoft.mappingentity.repository;

import com.cybersoft.mappingentity.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
}
