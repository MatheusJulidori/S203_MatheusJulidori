package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.inatel.labs.labads.padraosoa.model.entity.Book;

@Service
public class BookService {
	private List<Book> bookList = new ArrayList<>();
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L, "Harry Potter", "Magia");
		Book b2 = new Book(2L, "Python", "Programação");
		Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	public List<Book> searchBook(){
		return bookList;
	}
	
	public Optional<Book> findBookById(Long id) {
		Optional<Book> bookEncontrado = bookList.stream()
			.filter( b -> b.getId().equals(id))
			.findFirst();
		return bookEncontrado;
	}
	
	public Book createBook(Book b) {
		Long idGerado = new Random().nextLong();
		b.setId(idGerado);
		bookList.add(b);
		return b;
	}

}
