package br.inatel.labs.labads.padraosoa.client;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebClientGetAllBooks_Mono {	
	
	public static void main(String[] args) {
		Mono<BookDTO[]> monoArrayBook = WebClient.create("http://localhost:8080")
				.get()
				.uri("/book")
				.retrieve()
				.bodyToMono(BookDTO[].class);
		
		monoArrayBook.subscribe();
		
		BookDTO[] arrayBook = monoArrayBook.block();
		
		for(BookDTO dto : arrayBook) {
			System.out.println(dto);
		}

	}
}
