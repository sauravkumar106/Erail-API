package in.saurav.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.saurav.entity.Book;
import in.saurav.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
		this.repository=repository;
	}
	@Override
	public String upSertBook(Book book) {
	    boolean isNew = (book.getBookId() == null);
	    
	    repository.save(book);
	    
	    if(isNew) {
	        return "Created";
	    }
	    return "Updated";
	}


	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);
		return "Book Deleted";
	}

}
