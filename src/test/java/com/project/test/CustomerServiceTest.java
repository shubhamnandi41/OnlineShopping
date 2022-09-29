package com.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.project.dao.CustomerRepository;
import com.project.entity.Customer;
import com.project.exception.AlreadyExistException;
import com.project.service.CustomerService;

@ComponentScan("com.project")
@SpringBootTest
class CustomerServiceTest {
	
	
	@Autowired
	private CustomerRepository cuRep;
	
	@Autowired
	private CustomerService cssr;
	
	@Test	
	public void createCustomerTest() throws AlreadyExistException
	{
		Customer c = new Customer("ads", "dasd", "dasdw", "sdw", "qggc", "dasdw");
		cuRep.save(c);
		Optional<Customer> co = cuRep.findById(c.getUsername());
		Customer c2=null;
		if(co.isPresent())
			c2=co.get();
		assertEquals(c.getUsername(),c2.getUsername());
	}
	
	@Test
	public void checkCustomerTest()
	{
		Customer c = new Customer("ads", "dasd", "dasdw", "sdw", "qggc", "dasdw");
		cuRep.save(c);
		Optional<Customer> co = cuRep.findById(c.getUsername());
		Customer c2=null;
		if(co.isPresent())
			if(co.get().getPass().equals(c.getPass()))
				c2=co.get();
		assertEquals(c.getPass(), c2.getPass());
	}
	
}
