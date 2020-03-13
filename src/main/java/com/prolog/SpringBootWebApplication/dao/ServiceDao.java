package com.prolog.SpringBootWebApplication.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.prolog.SpringBootWebApplication.beans.BooksContributed;
import com.prolog.SpringBootWebApplication.beans.NewUser;

@Repository
@Transactional
public class ServiceDao {
	@PersistenceContext
	  EntityManager entityManager;
public void save(BooksContributed book) {
	entityManager.persist(book);
  }
public void addUser(NewUser user) {
	 entityManager.persist(user);
  }
public NewUser findUser(String email, String password) {
	NewUser user=entityManager.find(NewUser.class,email);
	System.out.println(user.getName());
  // if(user.getPassword().equals(password))
	return user;
}
public void update(NewUser user) {
	entityManager.merge(user);
}
public List<BooksContributed> bookC() {
	return entityManager.createNamedQuery("find_all_bookC").setParameter("type", "C").getResultList();
}
public List<BooksContributed> bookCpp() {
	return entityManager.createNamedQuery("find_all_bookCpp").setParameter("type", "Cpp").getResultList();
}
}

