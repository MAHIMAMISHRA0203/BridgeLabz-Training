import java.util.*;
abstract class WarehouseItem{
	String itemId;
	String itemName;
	WarehouseItem(String itemId,String itemName){
		this.itemId=itemId;
		this.itemName=itemName;
	}
	public abstract void display();
}

class  Storage <T extends WarehouseItem> {
	private ArrayList<T> items=new ArrayList<>();
	public void adds(T item){
		items.add(item);
		
	}
	public void displayAll() {
		 for (T item : items) {
	            item.display();   
	}
}}
 class Electronics extends WarehouseItem{
	 Electronics(String itemId,String itemName){
		 super(itemId,itemName);
	 }
	public void display() {
		 System.out.println("item id:"+itemId);
		 System.out.println("item name:"+itemName);

	 }
 }

public class SmartWarehouseManagementSystem {
public static void main(String args[]) {
    Storage<Electronics> electronicsStorage = new Storage<>();
    electronicsStorage.adds(new Electronics("h875fc","Mahi"));
    electronicsStorage.adds(new Electronics("a982kd", "Mobile"));

    electronicsStorage.displayAll();
}
}