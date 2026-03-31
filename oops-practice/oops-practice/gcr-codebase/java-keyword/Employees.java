class Employee{
    static  String companyName="Cognizant Pvt. Ltd.";
    String name;
    final  int id;
    String designation;
    int totalEmployees;

      Employee( String designation,int id){
          
          this.designation=designation;
          this.id=id;
          totalEmployees++;
      }
        void displayTotalEmployees(){
        System.out.println(totalEmployees);
    }
     void displayDetails(){
        if(this instanceof Employee){
            System.out.println("Total Employee:"+totalEmployees);
            System.out.println("Company Name :"+companyName);
            System.out.println("Employee ID:"+id);

            
        }else{
              System.out.println("Invalid instance");

        }
    }
    
    

    
}
public class Employees
{
	public static void main(String[] args) {
	  Employee e=new Employee("Mathura", 101);
	  e.displayDetails();
	   e.displayTotalEmployees();
	    Employee e2=new Employee("Chennai", 103883);
	  e2.displayDetails();
	   e2.displayTotalEmployees();
	    
	}
}
