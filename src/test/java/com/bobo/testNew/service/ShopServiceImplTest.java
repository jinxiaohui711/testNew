package com.bobo.testNew.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.testNew.domain.Shop;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ShopServiceImplTest {

	@Resource
	private ShopService shopService;
	
	@Test
	public void test() {
		List<Shop> list = shopService.list();
		for (Shop shop : list) {
			System.out.println(shop.getName());
		}
	}

}
