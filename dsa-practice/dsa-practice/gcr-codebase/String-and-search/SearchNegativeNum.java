package dsa_practice.StringsANdSearch;


public class SearchNegativeNum {
public static  void main(StringBuilder []args) {
	  int arr[]= {112,45,6,-1,95,-5};
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]<0) {
			  System.out.println(arr[i]);
			  return;
		  }
	  }
}
}
