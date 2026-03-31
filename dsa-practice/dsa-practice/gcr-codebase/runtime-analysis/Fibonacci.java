package runtimeAnalysis;

public class Fibonacci {
	public static int FibRecursive(int number) {
		if(number<=1){
			return 0;		
		}
		return FibRecursive(number-1)+FibRecursive(number-2);
	}
	public static void FibIterative(int number) {
		int a=0;int b=1;
		for(int i=3;i<=number;i++) {
			int temp=a+b;
			a=b;
			b=temp;
			
		}
		
		
	}
		
public static void main(String args[]) {
	 double start1=System.nanoTime();
FibIterative(5);    
double end1=System.nanoTime();
     double timeTaken1=end1-start1;
     System.out.println("Time taken by Fibonacci using recursion: "+timeTaken1+" nanoseconds");
     double start2=System.nanoTime();
     FibRecursive(5);
     double end2=System.nanoTime();
     double timeTaken2=end2-start2;
     System.out.println("Time taken by Fibonacci using Iteration: "+timeTaken2+" nanoseconds");
}
}
