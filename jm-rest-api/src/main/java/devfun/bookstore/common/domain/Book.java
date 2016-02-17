package devfun.bookstore.common.domain;

import java.util.Date;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;


@AutoProperty
public class Book {
    private Long id;
    private String title;
    private String creator;
    private String type;
    private Date date;
    
    public Book() {
    }
    //마스터는 변경되었습니다.
    public Book(Long id, String title, String creator, String type, Date date) {
        super();
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.type = type;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        return Pojomatic.hashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return Pojomatic.equals(this, obj);
    }

    @Override
    public String toString() {
        return Pojomatic.toString(this);
    }
    
    
    
    
}
