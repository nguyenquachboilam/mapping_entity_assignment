package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "food_order")
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "price")
    private float price;

    @Column(name = "quality")
    private int quality;

    @Column(name = "id_promo")
    private int idPromo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_order")
    private TOrderEntity tOrderEntity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_food")
    private FoodEntity foodEntity;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public TOrderEntity gettOrderEntity() {
        return tOrderEntity;
    }

    public void settOrderEntity(TOrderEntity tOrderEntity) {
        this.tOrderEntity = tOrderEntity;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
