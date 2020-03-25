package com.bobo.testNew.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bobo.testNew.domain.Shop;

@Repository
public interface ShopMapper {

	List<Shop> list();
	
}
