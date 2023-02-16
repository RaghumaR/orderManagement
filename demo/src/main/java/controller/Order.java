package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.CustomerOrderDetails;
import repos.OrderRepository;

@RestController

 class Order {
	
	@Autowired
	OrderRepository orderRepository;

	 //Creating the order in mysql DB
	@PostMapping("v1/createCustomerOrder")
	public CustomerOrderDetails createCustomerOrder(@RequestBody CustomerOrderDetails uploadCustomerDataPayload){
		return orderRepository.save(uploadCustomerDataPayload);
	}
	
	//Retrieving the order from mysql db using orderId
	@GetMapping("v1/getCustomerDat/{id}")
	public CustomerOrderDetails getCustomerDetailsFromOrder(@PathVariable int id) {
		return orderRepository.findById(id).get();
	}
}
