package com.one.demo;

import com.one.mapper.AreaMapper;
import com.one.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private AreaMapper areaMapper;
	@Autowired
	private AreaService  areaService;
	
	@Test
	public void contextLoads() {
		System.out.println(areaMapper);
		System.out.println(areaService.getClass());
	}

}
