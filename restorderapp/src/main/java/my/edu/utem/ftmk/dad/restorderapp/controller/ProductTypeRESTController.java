package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.ftmk.dad.restorderapp.model.ProductType;
import my.edu.utem.ftmk.dad.restorderapp.respository.ProductTypeRepository;
@RestController
@RequestMapping("/api/producttype")
public class ProductTypeRESTController {
	@Autowired
	private ProductTypeRepository productTypeRepository;
	//delete existing ProductType
	@DeleteMapping("{productTypeId}")
	public ResponseEntity<HttpStatus> deleteProductType(@PathVariable long productTypeId) {
		productTypeRepository.deleteById(productTypeId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	//list all the ProductType
	@GetMapping
	public List<ProductType> getProductType() {
		return productTypeRepository.findAll();
	}
	//get specific ProductType
	@GetMapping("{productTypeId}")
	public ProductType getProductType(@PathVariable long productTypeId) {
		ProductType productType = productTypeRepository.findById(productTypeId).get();
		return productType;
	}
	//insert a new ProductType
	@PostMapping()
	public ProductType InsertProductType(@RequestBody ProductType productType) {
		return productTypeRepository.save(productType);
	}
	//update ProductType
	@PutMapping()
	public ProductType updateProductType(@RequestBody ProductType  productType) {
		return productTypeRepository.save(productType);
	}
	
	
}
