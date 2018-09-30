package com.manager.Internship;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.manager.Internship.controllers.appController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = appController.class)
@SpringBootTest
public class InternshipApplicationTests {
	@Autowired
	private WebApplicationContext context;
	private MockMvc mocMvc;
	
//	@Before
//	public void setup() {
//		this.mocMvc = webAppContextSetup(this.context).build();
//	}
	

	@Test
	public void contextLoads() throws Exception {
		this.mocMvc.perform(get("/")).andExpect(status().isOk());
	}
	
	@After
	public void downUp() {
		this.mocMvc=null;
	}

}
