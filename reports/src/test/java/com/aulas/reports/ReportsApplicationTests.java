package com.aulas.reports;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportsApplicationTests {

	@Test
	public void contextLoads() {
		long num = 1;
		
		assertEquals(num, 1);
	}

}
