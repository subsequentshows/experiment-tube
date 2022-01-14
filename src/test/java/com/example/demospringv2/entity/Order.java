package com.example.demospringv2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")


public class Order {
    @Id
    private int oderId;
    private int customerId;
    private double totalPrice;
    private LocalDate creatAt;
    private LocalDate updateAt;

//    private String name;
//    private double price;
//    private String status;
}
