package com.bobo.testNew.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.bobo.testNew.dao.ShopMapper;
import com.bobo.testNew.domain.Shop;

@Service
public class ShopServiceImpl implements ShopService{

	@Resource
	private ShopMapper shopMapper;
	
	@Override
	public List<Shop> list() {
		return shopMapper.list();
	}

	
	
}
