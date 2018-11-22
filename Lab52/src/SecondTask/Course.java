package SecondTask;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseTitle;
    private TextBook textBook;
    private Instructor instructor;
    Course(){}
    Course(String courseTitle,TextBook textBook,Instructor instructor){
        this.courseTitle = courseTitle;
        this.textBook = textBook;
        this.instructor = instructor;
    }
    Course(String courseTitle,String isbn,String title,String author,String firstName,String lastName,String department,String email){
        this.courseTitle = courseTitle;
        this.textBook = new TextBook(isbn,title,author);
        this.instructor = new Instructor(firstName,lastName,department,email);
    }
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    public void setTextBook(TextBook textBook){
        this.textBook = textBook;
    }
    public void setTextBook(String isbn,String title,String author){
        this.textBook = new TextBook(isbn,title,author);
    }
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public void setInstructor(String firstName,String lastName,String department,String email){
        this.instructor = new Instructor(firstName,lastName,department,email);
    }
    public String getCourseTitle(){
        return this.courseTitle;
    }
    public TextBook getTextBook(){
        return this.textBook;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public String toString(){
        return courseTitle + " " + this.instructor.toString() + " " + this.textBook.toString();
    }
    public boolean equals(Object o){
        Course course = (Course)o;
        boolean ok  = false;
        if(course.getCourseTitle().equals(this.courseTitle) && course.getInstructor().equals(this.instructor) && course.getTextBook().equals(this.textBook)){
            ok = true;
        }
        return ok;
    }
}
