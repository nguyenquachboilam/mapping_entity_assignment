package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "food")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;

    @OneToOne(mappedBy = "foodEntity")
    private FoodDetailEntity foodDetailEntity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity categoryEntity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantEntity;

    @OneToMany(mappedBy = "foodEntity")
    private Set<FoodReviewEntity> foodReviewEntities;

    @OneToMany(mappedBy = "foodEntity")
    private Set<FoodAddonEntity> foodAddonEntities;

    @OneToMany(mappedBy = "foodEntity")
    private Set<FoodMaterialEntity> foodMaterialEntities;

    @OneToMany(mappedBy = "foodEntity")
    private Set<FoodOrderEntity> foodOrderEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FoodDetailEntity getFoodDetailEntity() {
        return foodDetailEntity;
    }

    public void setFoodDetailEntity(FoodDetailEntity foodDetailEntity) {
        this.foodDetailEntity = foodDetailEntity;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public RestaurantEntity getRestaurantEntity() {
        return restaurantEntity;
    }

    public void setRestaurantEntity(RestaurantEntity restaurantEntity) {
        this.restaurantEntity = restaurantEntity;
    }

    public Set<FoodReviewEntity> getFoodReviewEntities() {
        return foodReviewEntities;
    }

    public void setFoodReviewEntities(Set<FoodReviewEntity> foodReviewEntities) {
        this.foodReviewEntities = foodReviewEntities;
    }

    public Set<FoodAddonEntity> getFoodAddonEntities() {
        return foodAddonEntities;
    }

    public void setFoodAddonEntities(Set<FoodAddonEntity> foodAddonEntities) {
        this.foodAddonEntities = foodAddonEntities;
    }

    public Set<FoodMaterialEntity> getFoodMaterialEntities() {
        return foodMaterialEntities;
    }

    public void setFoodMaterialEntities(Set<FoodMaterialEntity> foodMaterialEntities) {
        this.foodMaterialEntities = foodMaterialEntities;
    }

    public Set<FoodOrderEntity> getFoodOrderEntities() {
        return foodOrderEntities;
    }

    public void setFoodOrderEntities(Set<FoodOrderEntity> foodOrderEntities) {
        this.foodOrderEntities = foodOrderEntities;
    }
}
