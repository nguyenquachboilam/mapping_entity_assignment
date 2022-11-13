package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "food_material")
public class FoodMaterialEntity {

    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_food")
    private FoodEntity foodEntity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_material")
    private MaterialEntity materialEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }

    public MaterialEntity getMaterialEntity() {
        return materialEntity;
    }

    public void setMaterialEntity(MaterialEntity materialEntity) {
        this.materialEntity = materialEntity;
    }
}
