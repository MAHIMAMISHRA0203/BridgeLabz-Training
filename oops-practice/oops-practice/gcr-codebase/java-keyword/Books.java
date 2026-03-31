class Book{
    static  String libraryName="Kaagzaat Library";
    String title;
     String author;
      final int isbn;
      Book(String title, String author,int isbn){
          this.title=title;
          this.author=author;
          this.isbn=isbn;
      }
       static void displayLibraryName(){
        System.out.println(libraryName);
    }
     void displayDetails(){
        if(this instanceof Book){
                        System.out.println("Title:"+title);

             System.out.println("Author :"+author);
            System.out.println("ISBN:"+isbn);

            
        }else{
              System.out.println("Invalid instance");

        }
    }
    
    

    
}
public class Main
{
	public static void main(String[] args) {
	   Book b=new Book("ijiojiwejfi","uhfiwuhfu",7890);
	     b.displayDetails();
	     b.displayLibraryName();
	     Book b2=new Book("Wings of fire","APJ ",74894);
	     b2.displayDetails();
	     b2.displayLibraryName();
	   
	    
	}
}