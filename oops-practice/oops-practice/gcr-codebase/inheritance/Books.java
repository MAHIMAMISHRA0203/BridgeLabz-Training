// Superclass
class Book {
    String title;
    int publicationYear;
    

    // Constructor
    public Book(int publicationYear, String title) {
        this.publicationYear = publicationYear;
        this.title = title;
    }

    // Method to display Book information
    public void displayInfo() {
        System.out.println("The title of the book is : " + title );
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Car
class Author extends Book {
String author; String bio;
    public Author(String author, String  bio,String title,int publicationYear) {
        super(publicationYear, title);
        this.author = author;
        this.bio=bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author of the book:"+author);
        super.displayInfo();
        System.out.println("Bio:"+bio);
        System.out.println();
    }
}





// Main class
public class Books {
    public static void main(String[] args) {


       Book b1=new Author("Wings ","It is the book of the year","APJ",1998);
       b1.displayInfo();
    }
}
