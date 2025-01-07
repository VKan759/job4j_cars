package ru.job4j.cars.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "engine")
public class Engine {
    private int id;

    @Column(nullable = false)
    private String name;
}
