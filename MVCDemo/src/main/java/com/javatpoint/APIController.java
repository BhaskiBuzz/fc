package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kfc/brands/")
public class APIController {
	
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {
		System.out.println("it came here..");
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
		
		return shop;
		

	}

}
