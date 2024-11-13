package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "auto_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String login;
    private String password;
}
