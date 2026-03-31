// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class EmployeeDetails{
    int id;
    String name;
    int salary;
    public void display(int id,String name,int salary){
        System.out.println("Name of employee:"+name);
        System.out.println("Id of employee:"+id);
        System.out.println("Salary of employee:"+salary);
    }
}
class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp=new EmployeeDetails();
        emp.display(4,"Mahima",3500000);
        
        
    }
}