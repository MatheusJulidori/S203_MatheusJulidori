package br.inatel.labs.labads.padraosoa.client;

public class BookDTO {

	private Long id;
	private String title;
	private String category;
	
	//getters e setters
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
	
	//toString()
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", category=" + category + "]";
	}
	
	
	
}
