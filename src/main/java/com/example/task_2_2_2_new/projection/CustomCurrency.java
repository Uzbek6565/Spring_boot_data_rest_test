package com.example.task_2_2_2_new.projection;

import com.example.task_2_2_2_new.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
}
