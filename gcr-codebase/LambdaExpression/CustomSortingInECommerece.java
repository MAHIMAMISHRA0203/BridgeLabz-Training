package lambdaExpression;

import java.util.ArrayList;
import java.util.List;


class ECommerce{
	String name;
	double price;double rating;double discount;
	public ECommerce(String name,double price,double rating, double discount
			) {
		this.name=name;
		this.discount=discount;
		this.price=price;
		this.rating=rating;
	}
	 public String toString() {
		 
return 	"name: "+name +"| discount:"+discount+"| rating:"+rating+"| price:"+price;
	}
	
}
public class CustomSortingInECommerece {
public static void main(String args[]) {
	List<ECommerce>list=new ArrayList<>();
	
	list.add(new ECommerce("Headphones",2000, 6.6,7.8));
	list.add(new ECommerce("watch",1500, 9.0,72.3));

	list.add(new ECommerce("Ring",3.4, 6.6,7.8));
	list.sort((a,b)->Double.compare(a.price,b.price));
list.forEach(product->System.out.println(product.toString()));	

	 
}
}
