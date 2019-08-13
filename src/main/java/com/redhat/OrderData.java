package com.redhat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * OrderData
 */
@Entity
@Table(name = "order_data")
public class OrderData extends PanacheEntity {

    public BigDecimal orderAmount;
    public Date createdTime;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<OrderLineItem> orderLines;
}