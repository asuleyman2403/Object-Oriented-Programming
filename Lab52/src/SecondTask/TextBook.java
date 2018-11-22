package SecondTask;

import java.io.Serializable;

public class TextBook implements Serializable {
    private String isbn;
    private String title;
    private String author;
    TextBook(){}
    TextBook(String isbn,String title,String author){
        this.isbn  = isbn;
        this.title = title;
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.title = title;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return this.isbn + " " + this.author + " " + this.title;
    }
    public boolean equals(Object o){
        TextBook book = (TextBook)o;
        boolean ok = false;
        if(book.getAuthor().equals(this.author) && book.getIsbn().equals(this.isbn) && book.getTitle().equals(this.title)){
            ok = true;
        }
        return ok;
    }


}
