package com.example.task_2_2_2_new.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @SequenceGenerator(name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(generator = "order_sequence", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private Timestamp date;

    @Column
    private String username;

    @OneToOne
    private Currency currency;
}
