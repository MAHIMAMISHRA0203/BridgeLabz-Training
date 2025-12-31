class Book{
    
     String title;
     String author;
     int price;
     boolean availability;
     Book( String title,
     String author,
     int price,
     boolean availability){
         System.out.println("parameterised constructors");
         this.title=title;
         this.author=author;
         this.price=price;
         this.availability=true;
     }
     
         
     void borrow(){
         if(availability){
         availability=false;
            System.out.println("The book has been issued");}
         else
            System.out.println("The book is not available");

     }
     
     void display(){
         System.out.println(title);
         System.out.println(author);
         System.out.println(price);


     }
}
public class Books
{
	public static void main(String[] args) {
	    Book book=new Book("Wings of fire","APJ Abdul Kalam",200,true);
	    book.display();
	    book.borrow();


	    

	    
	    
	}
}