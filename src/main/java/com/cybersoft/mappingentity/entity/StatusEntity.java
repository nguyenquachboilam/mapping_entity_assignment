package com.cybersoft.mappingentity.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "statusEntity")
    private Set<OrderStatusEntity> orderStatusEntities;

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

    public Set<OrderStatusEntity> getOrderStatusEntities() {
        return orderStatusEntities;
    }

    public void setOrderStatusEntities(Set<OrderStatusEntity> orderStatusEntities) {
        this.orderStatusEntities = orderStatusEntities;
    }
}
