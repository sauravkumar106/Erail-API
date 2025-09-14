package in.saurav.repo;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import in.saurav.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{
	
}
