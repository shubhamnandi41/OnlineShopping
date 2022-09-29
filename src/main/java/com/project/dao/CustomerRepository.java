package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
