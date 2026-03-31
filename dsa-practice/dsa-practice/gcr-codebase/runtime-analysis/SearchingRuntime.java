package runtimeAnalysis;

import java.util.*;


 

public class SearchingRuntime {
	public static void array(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return; 
			}
		}
	}
	public static void hashset(HashSet<Integer>map,int target) {
        Iterator<Integer> it = map.iterator();

	for(it.hasNext()) {
		if(i.hasNext()==target) {
			return;
		}
	}
	}

	
public static void main(String args[]) {
	int arr[]= {4, 2,7,0,1};
	 double start1=System.nanoTime();
	 array(arr, 0);
 double end1=System.nanoTime();
    double timeTaken1=end1-start1;
    System.out.println("Time taken in searching element in array : "+timeTaken1+" nanoseconds");
    double start2=System.nanoTime();
hashset(arr,0);
    double end2=System.nanoTime();
    double timeTaken2=end2-start2;
    System.out.println("Time taken by Fibonacci using Iteration: "+timeTaken2+" nanoseconds");
	
}
}
