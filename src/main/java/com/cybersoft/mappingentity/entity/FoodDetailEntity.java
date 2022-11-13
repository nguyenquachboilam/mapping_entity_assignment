package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "food_detail")
public class FoodDetailEntity {
    @Id
    @Column(name = "id_food")
    private int idFood;

    @Column(name = "description")
    private String description;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "rating")
    private float rating;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_food")
    private FoodEntity foodEntity;

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
