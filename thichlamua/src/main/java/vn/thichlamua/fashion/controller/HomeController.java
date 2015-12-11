package vn.thichlamua.fashion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/{shopName}")
	public String getViewByCustomer(@PathVariable("shopName") String shopName){
		return "user/fashion/kuteshop/kuteshop";
	}
	
}
