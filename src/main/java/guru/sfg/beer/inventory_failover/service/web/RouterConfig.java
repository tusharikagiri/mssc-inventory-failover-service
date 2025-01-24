package guru.sfg.beer.inventory_failover.service.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class RouterConfig {

	@Bean
	public RouterFunction<ServerResponse> inventoryRoute(InventoryHandler inventoryHandler){
		return route(GET("/inventory-failover").and(accept(MediaType.APPLICATION_JSON)),
				inventoryHandler::listInventory);
	}
}
