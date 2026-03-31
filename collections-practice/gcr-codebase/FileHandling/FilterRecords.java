package CSVFiles;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
public static void main(String args[]) {
	try(BufferedReader file=new BufferedReader(new FileReader("data.csv"))) {
		file.lines()
		.map(line->line.split(","))
		.filter(col->Integer.parseInt(col[3])>80)
		.forEach(col->System.out.println(   "ID: " + col[0] +
                ", Name: " + col[1] +
                ", Age: " + col[2] +
                ", Marks: " + col[3]));
		
	}catch(Exception e) {
		System.out.println(e.getStackTrace());
	}
}
}
