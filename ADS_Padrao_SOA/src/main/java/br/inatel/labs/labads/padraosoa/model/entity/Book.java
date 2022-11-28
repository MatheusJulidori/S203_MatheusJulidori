package br.inatel.labs.labads.padraosoa.model.entity;

public class Book {
	private Long id;
	private String title;
	private String category;
	
	//constructor
	public Book(Long id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
	}

	//getters setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
