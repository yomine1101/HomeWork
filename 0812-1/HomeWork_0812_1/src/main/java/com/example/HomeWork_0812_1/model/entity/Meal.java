package com.example.HomeWork_0812_1.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column
    private int price;

    @Column(nullable = false, length = 50)
    private String description;

    //cascadeType 加載方式
    //merge = 更新時 一起更新
    //optional false = order不得為空
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, optional = false)
    @JoinColumn(name = "order_id") //設置在Meal的Fk
    private Order order; //所屬的order
}
