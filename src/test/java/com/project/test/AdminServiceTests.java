package com.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import com.project.dao.AdminRepository;
import com.project.dao.ProductRepository;
import com.project.dao.RetailerRepository;
import com.project.entity.Admin;
import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;
import com.project.service.AdminService;

@ComponentScan("com.project")
@SpringBootTest
class AdminServiceTests {
	
	@Autowired
	private AdminRepository adminrep;
	
	@Autowired
	private AdminService asr;
	
	@Autowired
	private RetailerRepository reRepo;
	
	@Autowired
	private ProductRepository proRep;
	
	@Test
	public void createAdminTest()
	{
		Admin a1 = new Admin();
		a1.setUsername("dummy");
		a1.setPassword("dummypass");
		adminrep.save(a1);
		assertNotNull(adminrep.findById("dummy").get());
		
	}
	
	@Test
	public void verifyAdminTest() throws NoSuchEntityException, PasswordMissmatchException {
		Admin a1 = new Admin();
		a1.setUsername("dummy");
		a1.setPassword("dummypass");
		adminrep.save(a1);
		
		assertEquals(a1, asr.verifyAdmin(a1));
	}
	
//	@Test
//	public void addRetailerTest() throws AlreadyExistException
//	{
//		Retailer r = new Retailer("sda", "af", "fads", "dfas", "sdfa");
//		reRepo.save(r);
//		assertEquals(r.getUsername(), asr.addRetailer(r).getUsername());
//	}
	
	@Test
	public void removeRetailerTest() throws NoSuchEntityException
	{
		Retailer r = new Retailer("s", "af", "fads", "dfas", "sdfa");
		reRepo.save(r);
		assertTrue(r==asr.removeRetailer(r));
	}
	
//	@Test
//	public void getAllRetailerTest()
//	{
//		Retailer r = new Retailer("s", "af", "fads", "dfas", "sdfa");
//		Retailer r2 = new Retailer("e", "sdaf", "fsdads", "dfdasas", "sdfdaa");
//		reRepo.save(r);
//		reRepo.save(r2);
//		assertEquals(4, asr.getRetailers().size());
//	}
	
	@Test
	public void getAdminTest()
	{
		Admin a1 = new Admin();
		a1.setUsername("dummy");
		a1.setPassword("dummypass");
		Admin a2 = new Admin();
		a2.setUsername("dummy2");
		a2.setPassword("dummypass2");
		adminrep.save(a1);
		adminrep.save(a2);
		assertEquals(3, asr.getAdmin().size());
	}
	
	@Test
	public void getprodTest()
	{
		Product pro = new Product(1, "sdasd", 123, 120, "sda", "weqw", "ewqe");
		Product pro2 = new Product(2, "sdasdasd", 12332, 1230, "sdasdda", "weqwds", "ewqdse");
		proRep.save(pro);
		proRep.save(pro2);
		assertEquals(2, asr.getAllProducts().size());
	}
}
