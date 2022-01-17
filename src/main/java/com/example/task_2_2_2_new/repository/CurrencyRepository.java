package com.example.task_2_2_2_new.repository;

import com.example.task_2_2_2_new.entity.Currency;
import com.example.task_2_2_2_new.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {

}
