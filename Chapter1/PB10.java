package Chapter1;

class book{
    private String book_author;
    book(String book_author){
        this.book_author = book_author;
    }
    void display(){
        System.out.println("Book Author: " + book_author);
    }
    book(){
        System.out.println("No book title or author provided.");
    }
}
class book_publication extends book{
    private String title;
    book_publication(String title, String book_author){
        super(book_author);
        this.title = title;
    }
    void display(){
        System.out.println("Book Title: " + title);
        super.display();
    }


}

class paper_publication extends book{
    private String title;
    paper_publication(String title, String book_author){
        super(book_author);
        this.title = title;
    }
    void display(){
        System.out.println("Paper Title: " + title);
        super.display();
    }
}

public class PB10 {
    public static void main(String[] args) {
        book b = new book();
        book bp = new book_publication( "Java Programming", "John Doe");
        book pp = new paper_publication("AI Research", "Jane Smith");
        b.display(); // runs the method in book class
        bp.display(); // runs the method in book_publication class
        pp.display(); // runs the method in paper_publication class
    }
}
