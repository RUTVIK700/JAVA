package com.hibernate.jpahibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BooksManager {
	static EntityManagerFactory factory;
	static EntityManager entityManager;

	public static void main(String[] args) {
		begin();
		
		
		//create();
		//update();
		//find();
		query();
		//remove();
		end();
	}
	
	
	private static void remove() {
		Integer pk=3;
		Book ref=entityManager.getReference(Book.class, pk);
		entityManager.remove(ref);
	}

	private static void end() {
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

	private static void begin() {
		factory=Persistence.createEntityManagerFactory("BookUnit");
		entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
	}

	private static void query() {
		String jpql="Delete From Book b Where b.price>3";
		int createQuery = entityManager.createQuery(jpql).executeUpdate();
		/*String jpql="Select b From Book b Where b.price>3";
		Query createQuery = entityManager.createQuery(jpql);
		 @SuppressWarnings("unchecked")
		List<Book> resultList = createQuery.getResultList();
		for(Book aBook:resultList ) {
			System.out.println(aBook.getAuthor());
		}*/
	}
	private static void create() {
		Book newBook=new Book();
		newBook.setTitle("Hell");
		newBook.setAuthor("yy");
		newBook.setPrice(300);
		entityManager.persist(newBook);
	}
	
	private static void update() {
		Book existBook=new Book();
		existBook.setBookid(1);
		existBook.setTitle("eeeee");
		existBook.setAuthor("eeeee");
		existBook.setPrice(1000);
		entityManager.merge(existBook);
	}
	
	private static void find() {
		Integer pk=2;
		Book book=entityManager.find(Book.class, pk);
		System.out.println(book.getAuthor());
	}

}
