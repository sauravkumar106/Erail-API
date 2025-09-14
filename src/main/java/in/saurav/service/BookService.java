package in.saurav.service;

import java.util.List;

import in.saurav.entity.Book;

public interface BookService {
	
	public String upSertBook(Book book);
	public List<Book> getAllBooks();
	//public String updateBook(Book book);
	public String deleteBook(Integer bookId);
}
