package com.example.task_2_2_2_new.projection;

import com.example.task_2_2_2_new.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    String getUsername();
    Timestamp getDate();
}
