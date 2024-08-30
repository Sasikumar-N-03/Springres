package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//	@GetMapping("/users")
//	public String getUser() {
//		return "hi Spring boot";
	
@GetMapping("/Mark")
public int addMark(@RequestParam("a")int op1,@RequestParam("b")int op2){
return op1+op2;
}
@GetMapping("/sub")
public int sub(@RequestParam("a") int op1,@RequestParam("b")int op2) {
    return op1-op2;
}
@GetMapping("/Mul/{a}/{b}")
public int mul(@PathVariable("a") int op1,@PathVariable("b")int op2) {
    return op1*op2;
}
} 

