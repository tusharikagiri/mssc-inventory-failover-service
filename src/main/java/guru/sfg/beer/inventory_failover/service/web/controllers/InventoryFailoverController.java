package guru.sfg.beer.inventory_failover.service.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.sfg.beer.inventory_failover.service.services.FailoverInventoryService;
import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
//@RequestMapping("/api/v1/inventory-failover")
//@RestController
public class InventoryFailoverController {
	
	private final FailoverInventoryService service;

	@GetMapping
	public ResponseEntity<BeerInventoryDto> beerInventoryDto() {
		log.debug("INVENTORY FAILOVER SERVICE is called");
		return new ResponseEntity<BeerInventoryDto>(service.defaultBeerInventoryDto(), HttpStatus.OK);
	}
}
