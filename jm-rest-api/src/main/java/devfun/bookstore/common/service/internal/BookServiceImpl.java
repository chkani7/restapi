package devfun.bookstore.common.service.internal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import devfun.bookstore.common.domain.Book;
import devfun.bookstore.common.mapper.BookMapper;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    /* (non-Javadoc)
     * @see devfun.bookstore.service.internal.BookService#getBooks()
     */
    @Override
    public List<Book> getBooks() {
        return bookMapper.select();
    }

    /* (non-Javadoc)
     * @see devfun.bookstore.service.internal.BookService#getBook(java.lang.Long)
     */
    @Override
    public Book getBook(Long id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    /* (non-Javadoc)
     * @see devfun.bookstore.service.internal.BookService#createBook(devfun.bookstore.common.domain.Book)
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int createBook(Book book) {
        return bookMapper.insert(book);
    }

    /* (non-Javadoc)
     * @see devfun.bookstore.service.internal.BookService#updateBook(devfun.bookstore.common.domain.Book)
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int updateBook(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    /* (non-Javadoc)
     * @see devfun.bookstore.service.internal.BookService#deleteBook(java.lang.Long)
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int deleteBook(Long id) {
        return bookMapper.deleteByPrimaryKey(id);
    }
}
