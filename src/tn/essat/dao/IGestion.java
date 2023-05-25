package tn.essat.dao;

import java.util.List;

import tn.essat.model.Category;
import tn.essat.model.Livre;

public interface IGestion {
	public void addBook(Livre li);
	public List<Livre>getAllBooks();
	public void deleteBook(int id);
	public Livre getBookById(int id);
	public List<Livre> getBooksByAuthor(String autor);
	public void addCategory(Category cat);
	public List<Category>getAllCategories();
	public Category getCategoryById(int id);
	public void deleteCategiry(int id);

}
