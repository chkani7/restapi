package devfun.bookstore.common.service.internal;

import java.util.List;
import devfun.bookstore.common.domain.Book;

public interface BookService {

    public abstract List<Book> getBooks();

    public abstract Book getBook(Long id);

    public abstract int createBook(Book book);

    public abstract int updateBook(Book book);

    public abstract int deleteBook(Long id);

}