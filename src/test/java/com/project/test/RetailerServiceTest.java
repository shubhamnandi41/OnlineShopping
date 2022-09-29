package com.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.project.dao.ProductRepository;
import com.project.entity.Product;
import com.project.exception.NoSuchEntityException;
import com.project.service.RetailerService;

@ComponentScan("com.project")
@SpringBootTest
class RetailerServiceTest {

	@Autowired
	private RetailerService resr;
	
	@Autowired
	private ProductRepository prorep;
	
	@Test
	public void addProdTest()
	{
		Product p = new Product(1, "fjjh", 12121, 2333, "dfa", "dfs", "ffd");
		prorep.save(p);
		assertEquals(p.getProdId(), resr.addProdToProducts(p).getProdId());
	}
	
	@Test
	public void removeProdTest() throws NoSuchEntityException
	{
		Product p = new Product(1, "fjjh", 12121, 2333, "dfa", "dfs", "ffd");
		prorep.save(p);
		assertFalse(p!=resr.removeProdFromProducts(p));
	}
	
	@Test
	public void findProdByIdTest() throws NoSuchEntityException
	{
		Product p = new Product(1, "fjjh", 12121, 2333, "dfa", "dfs", "ffd");
		prorep.save(p);
		assertEquals(p.getProdName(), resr.findProdByPid(1).getProdName());
	}
	
	@Test
	public void getAllProdTest()
	{
		assertEquals(2, resr.getAllProducts().size());
	}
	
}

