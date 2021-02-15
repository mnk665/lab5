public class Book {
    private String title;
    private String author;
    private int year_of_pub;

    public Book() {
        title="";
        author="";
        year_of_pub=0;
    }

    public Book(String title, String author, int year_of_pub) {
        this.title = title;
        this.author = author;
        this.year_of_pub = year_of_pub;
    }

    //getters
    public String getTitle() {return title; }
    public String getAuthor() {return author;}
    public int getYear_of_pub() {return year_of_pub;}

    //setters
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setYear_of_pub(int year_of_pub) {this.year_of_pub = year_of_pub;}


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year_of_pub=" + year_of_pub +
                '}';
    }
}
