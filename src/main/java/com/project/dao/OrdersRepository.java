package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Orders;

@Repository
public interface OrdersRepository  extends JpaRepository<Orders, Integer> {

}
