class Product{
    	    String productName;
    	    int price;
    	    static int totalProducts;
    	    Product(int price, String productName){
    	        this.price=price;
    	         this.productName=productName;
    	        totalProducts++;
    	    }
    	    void displayProductDetails(){
    	       
    	        System.out.println("Product details:");
    	        System.out.println(productName);
    	        System.out.println(price);
    	        System.out.println(totalProducts);
    	        

    	    }
    	    void displayTotalProducts(){
    	        System.out.println(totalProducts);
    	    }

    
}
public class products
{
	public static void main(String[] args) {
	    Product p=new Product(100,"soap");
	    p.displayTotalProducts();
	    p.displayProductDetails();
	    Product p2=new Product(1300,"clothes");
	    p2.displayTotalProducts();
	    p2.displayProductDetails();
	    
	    
	}
}