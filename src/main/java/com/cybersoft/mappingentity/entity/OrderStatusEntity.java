package com.cybersoft.mappingentity.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "order_status")
public class OrderStatusEntity {
    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_order")
    private TOrderEntity tOrderEntity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_status")
    private StatusEntity statusEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TOrderEntity gettOrderEntity() {
        return tOrderEntity;
    }

    public void settOrderEntity(TOrderEntity tOrderEntity) {
        this.tOrderEntity = tOrderEntity;
    }

    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }
}
