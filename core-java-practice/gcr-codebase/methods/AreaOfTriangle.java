public class AreaOfTriangle {
    public static double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

  public static void main(String args[]){
  Scanner sc=new Scanner(Systeem.in);
  int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),x3=sc.nextInt(),y3=sc.nextInt();
  System.out.println("The Area of Triangle is: "+calculateArea(x1,y1,x2,y2,x3,y3);

  }
}