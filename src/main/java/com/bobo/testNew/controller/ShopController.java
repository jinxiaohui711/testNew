package com.bobo.testNew.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bobo.testNew.domain.Shop;
import com.bobo.testNew.service.ShopService;


@Controller
public class ShopController {

	@Resource
	private ShopService shopService;
	@RequestMapping("toList")
	public String list(Model model) {
		List<Shop> list = shopService.list();
		model.addAttribute("list", list);
		return "list";
	}
	
}
