
class AreaOfCircle{
    int radius;
    
    public void display(int radius){
        System.out.println("Area of circle is :"+3.14*radius*radius);
        
    }
}
class Main {
    public static void main(String[] args) {
        AreaOfCircle  area=new AreaOfCircle();
        area.display(4);
        
        
    }
}