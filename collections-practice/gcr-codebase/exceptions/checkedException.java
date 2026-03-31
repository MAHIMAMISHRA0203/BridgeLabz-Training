package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class checkedException {
public static void main(String args[]) {
try {
	FileReader file=new FileReader("data.txt");
	int data;
	while((data=file.read())!=-1) {
		System.out.println(data);
	}

}catch(IOException e){
	System.out.println("File not found");
}
}
}
