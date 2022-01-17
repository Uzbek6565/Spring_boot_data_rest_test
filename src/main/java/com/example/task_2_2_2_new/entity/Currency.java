package com.example.task_2_2_2_new.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Currency {
    @Id
    @SequenceGenerator(name = "currency_sequence",
            sequenceName = "currency_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "currency_sequence"
    )
    private Integer id;

    @Column(nullable = false,unique = true)
    private String name;

    @Transient
    private boolean active;
}
