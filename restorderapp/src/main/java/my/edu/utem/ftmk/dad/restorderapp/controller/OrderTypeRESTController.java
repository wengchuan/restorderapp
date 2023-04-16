package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import my.edu.utem.ftmk.dad.restorderapp.model.OrderType;
import my.edu.utem.ftmk.dad.restorderapp.respository.OrderTypeRepository;
//this class is the controller for the OrderType 
@RestController
@RequestMapping("/api/ordertype")
public class OrderTypeRESTController{
	@Autowired
	private OrderTypeRepository orderTypeRepository;
	//delete existing OrderType
	@DeleteMapping("{orderTypeId}")
	public ResponseEntity<HttpStatus> deleteOrderType(@PathVariable long orderTypeId) {
		orderTypeRepository.deleteById(orderTypeId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping
	public List<OrderType> getOrderType() {
		return orderTypeRepository.findAll();
	}
	//get specific OrderType
	@GetMapping("{orderTypeId}")
	public OrderType getOrderType(@PathVariable long orderTypeId) {
		OrderType orderType = orderTypeRepository.findById(orderTypeId).get();
		return orderType;
	}
	//insert a new OrderType
	@PostMapping()
	public OrderType InsertOrderType(@RequestBody OrderType orderType) {
		return orderTypeRepository.save(orderType);
	}
	//update OrderType
	@PutMapping()
	public OrderType updateOrderType(@RequestBody OrderType  orderType) {
		return orderTypeRepository.save(orderType);
	}
	
	
	

}
