/**
 * 
 */
package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

/**
 * @author Abridge
 *
 */
public interface BookRepo extends JpaRepository<Book, Integer> {
	
	public Optional <Book> findById(Integer id);
	
	public Book save(Book book);
	
	public List<Book> findAll();
	
	boolean existsById(Integer id);
	
	void deleteById(Integer id);

}
