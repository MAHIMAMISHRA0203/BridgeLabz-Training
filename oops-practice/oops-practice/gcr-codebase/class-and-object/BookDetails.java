// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class BookDetails{
   String title;
   int price;
   String author;
    public void display(String title,String author,int price){
        System.out.println("Title of the book:"+title);
         System.out.println("Author of the book:"+author);
         System.out.println("Price  of the book:"+price);

        
    }
}
class Main {
    public static void main(String[] args) {
        BookDetails  book=new BookDetails();
        book.display("2States","Chetan Bhagat",500);
                book.display("Wigs Of Fire","Abdul kalam",500);

        
        
    }
}