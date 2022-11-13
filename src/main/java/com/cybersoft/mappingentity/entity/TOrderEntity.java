package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class TOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "estimate_ship")
    private String estimateShip;

    @Column(name = "deliver_address")
    private String deliverAddress;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "tOrderEntity")
    private Set<OrderStatusEntity>orderStatusEntities;

    @OneToMany(mappedBy = "tOrderEntity")
    private Set<FoodOrderEntity> foodOrderEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstimateShip() {
        return estimateShip;
    }

    public void setEstimateShip(String estimateShip) {
        this.estimateShip = estimateShip;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Set<OrderStatusEntity> getOrderStatusEntities() {
        return orderStatusEntities;
    }

    public void setOrderStatusEntities(Set<OrderStatusEntity> orderStatusEntities) {
        this.orderStatusEntities = orderStatusEntities;
    }

    public Set<FoodOrderEntity> getFoodOrderEntities() {
        return foodOrderEntities;
    }

    public void setFoodOrderEntities(Set<FoodOrderEntity> foodOrderEntities) {
        this.foodOrderEntities = foodOrderEntities;
    }
}
