public class Employees

{
	public static void main(String[] args) {
	    Employee a=new Employee();
	     Employee a1=new Developer();
	      Employee a2=new Intern();
	       Employee a3=new Manager();
	       a.displayDetails();
	       a1.displayDetails();
	       a2.displayDetails();
	       a3.displayDetails();
	       
	    
	     
	}
}
class Employee{
    String name;
    int id;
    int salary;
    void displayDetails(){
        System.out.println("Displaying details");
    }
}
class Manager extends Employee{
    int teamSize;
    @Override
    void displayDetails(){
        System.out.println("I am Manager");

    }
    
    
}
class  Developer extends Employee{
   
    String programmingLanguage;
     @Override
    void displayDetails(){
            System.out.println("I am a developer");

    }
    
    
}
class Intern extends Employee{
     @Override
    void displayDetails(){
            System.out.println("I am a Intern");

    }
    
}