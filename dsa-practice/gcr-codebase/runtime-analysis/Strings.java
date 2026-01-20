package runtimeAnalysis;

public class Strings {
public static void main(String args[]) {
	StringBuilder s1=new StringBuilder("Mahima");
	StringBuffer s2=new StringBuffer("Mahima");
	String s3="Mahima";
    double start1=System.nanoTime();
     s1.append(" Mishra");
     double end1=System.nanoTime();
     double start2=System.nanoTime();

     s2.append("Mishra");
     double end2=System.nanoTime();
     double start3=System.nanoTime();
     s3=s3+" Mishra";
     double end3=System.nanoTime();
     System.out.println("Time taken by StringBuilder : "+ (end1-start1 )+" nanoseconds");

     System.out.println("Time taken by StringBuffer : "+(end2-start2)+" nanoseconds");

     System.out.println("Time taken by String : "+(end3-start3)+" nanoseconds");




}
}
