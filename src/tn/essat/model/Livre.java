package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//l'annotation hibernate entity pour la creation d'un tableau livre dans la base Livre 
@Entity

public class Livre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String title;
	private int quantity;
	private float price ;
	private String author;
	
	@ManyToOne 
	@JoinColumn(name="cat_id")
	private Category cat;
	
	
	public Livre(int id, String title, int quantity, float price, String author, Category cat) {
		super();
		this.id = id;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
		this.author = author;
		this.cat = cat;
	}
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	
	

}
