package com.cybersoft.mappingentity.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "material")
public class MaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "materialEntity")
    private Set<FoodMaterialEntity> foodMaterialEntities;

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

    public Set<FoodMaterialEntity> getFoodMaterialEntities() {
        return foodMaterialEntities;
    }

    public void setFoodMaterialEntities(Set<FoodMaterialEntity> foodMaterialEntities) {
        this.foodMaterialEntities = foodMaterialEntities;
    }
}
