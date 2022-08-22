package com.example.springwebservice.model.entriy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class User {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;


}
