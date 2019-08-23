package com.example.demo.DAO;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer>{
	
	public Optional<Book> findById(Integer id);
	public Book save(Book book);
	
	public List<Book> findAll();
	boolean existsById(Integer id);
	void deleteById(Integer id);
}
