package guru.sfg.beer.inventory_failover.service.web;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import guru.sfg.brewery.model.BeerInventoryDto;
import reactor.core.publisher.Mono;

@Component
public class InventoryHandler {
	
	public Mono<ServerResponse> listInventory(ServerRequest request) {
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(Arrays.asList(
						BeerInventoryDto.builder()
						.id(UUID.randomUUID())
						.beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
						.quantityOnHand(999)
						.createdDate(OffsetDateTime.now())
						.lastModifiedDate(OffsetDateTime.now())
						.build())), List.class);
	}

}
