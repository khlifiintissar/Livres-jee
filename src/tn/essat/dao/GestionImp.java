package tn.essat.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essat.model.Category;
import tn.essat.model.Livre;

public class GestionImp implements IGestion {
	Session session;
	
	

	
	public GestionImp() {
		
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();	
		session=sessionFactory.openSession();
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBook(Livre li) {
		session.getTransaction().begin();
		session.save(li);
		session.getTransaction().commit();
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Livre> getAllBooks() {
		Query<Livre> query = session.createQuery("select l from Livre l",Livre.class);
		return query.getResultList();
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteBook(int id) {
		session.getTransaction().begin();
		session.delete(getBookById(id));
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livre getBookById(int id) {
		// TODO Auto-generated method stub
		Livre book= session.load(Livre.class,id);
		return book;
	}

	@Override
	public List<Livre> getBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		 List<Livre> books = null;
		  String queryString = "SELECT b FROM Livre b WHERE b.author = :author";
		  Query<Livre> query = session.createQuery(queryString, Livre.class);
		  query.setParameter("author", author);
		  books = query.getResultList();
		return books;
	}

	@Override
	public void addCategory(Category cat) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		session.save(cat);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Query<Category> list=session.createQuery("select l from Category l",Category.class);
		
		return list.getResultList();
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		Category cat =session.load(Category.class, id);
		return cat;
	}

	@Override
	public void deleteCategiry(int id) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		session.delete(getCategoryById(id));
		session.getTransaction().commit();
		
	}

}
