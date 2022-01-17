package com.example.task_2_2_2_new.repository;

import com.example.task_2_2_2_new.entity.Order;
import com.example.task_2_2_2_new.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
