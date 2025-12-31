// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class HandlePhone{
   String brand;
   int itemPrice;
   String model;
    public void display(String brand,String model,int itemPrice){
        System.out.println("Brand of mobile :"+brand);
         System.out.println("Price of mobile:"+itemPrice);
         System.out.println("Model of mobile:"+model);
         System.out.println("----------------------------------");

        
    }
}
class Main {
    public static void main(String[] args) {
        HandlePhone  phone=new HandlePhone();
                phone.display("VIVO","VIVO V29e",32000);
                phone.display("ONE PLUS","ONE PLUS nord4",70000);


        
        
    }
}