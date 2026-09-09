package Aggregation;

// represents a textbook that can be used by a course
public class Textbook {
    // stores the textbook's title, author, and publisher
    private String title;
    private String author;
    private String publisher;

    // constructor to create a Textbook object
    public Textbook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // returns the textbook's title, author, and publisher
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    // changes the textbook's title, author, and publisher
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

}
