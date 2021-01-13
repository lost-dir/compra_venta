package com.compra.venta.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.compra.venta.bean.SaleBean;
//import com.compra.venta.model.Sale;
import com.compra.venta.service.impl.SaleServiceImpl;

@RestController
@RequestMapping("/sale")
public class SaleController {
	
	@Autowired
	private SaleServiceImpl saleService;
	
	@PostMapping("/saveSale")
	public ResponseEntity<Integer> saveSale(@Valid @RequestBody SaleBean saleBean){
		return new ResponseEntity<Integer>(this.saleService.saveSale(saleBean), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateSale")
	public ResponseEntity<Integer> updateSale(@Valid @RequestBody SaleBean saleBean){
		return new ResponseEntity<Integer>(this.saleService.updateSale(saleBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getSale/{idSale}")
	public ResponseEntity<SaleBean> getSale(@PathVariable("idSale") int idSale){
		return new ResponseEntity<SaleBean>(this.saleService.getSale(idSale), HttpStatus.FOUND);
	}
	
	@GetMapping("/getSale")
	public ResponseEntity<List<SaleBean>> getSales(){
		return new ResponseEntity<List<SaleBean>>(this.saleService.getSales(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteSale/{idSale}")
	public ResponseEntity<Boolean> deleteSale(@PathVariable("idSale") int idSale){
		return new ResponseEntity<Boolean>(this.saleService.deleteSale(idSale), HttpStatus.OK);
	}
}
