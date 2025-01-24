package guru.sfg.beer.inventory_failover.service.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class FailoverInventoryService {

	public BeerInventoryDto defaultBeerInventoryDto() {
		return BeerInventoryDto.builder()
				.id(UUID.randomUUID())
				.beerId("00000000000")
				.quantityOnHand(999)
				.build();
	}
}
