package OnlineCourseEnrollmentManager;

import java.lang.invoke.CallSite;
import java.time.LocalDate;
import java.util.List;

public class Main {
public static void main(String args[]) {
	
	List<EnrollmentDetails> list = List.of(
	        new EnrollmentDetails("Mahima Mishra", "Java", "Programming",
	                LocalDate.of(2024, 1, 10)),

	        new EnrollmentDetails("Garima Mishra", "Spring Boot", "Programming",
	                LocalDate.of(2024, 2, 5)),

	        new EnrollmentDetails("Riya Sharma", "Java", "Computer Science",
	                LocalDate.of(2024, 3, 15)),

	        new EnrollmentDetails("Aman Verma", "Data Structures", "Computer Science",
	                LocalDate.of(2024, 4, 20)),

	        new EnrollmentDetails("Kunal Singh", "Machine Learning", "AI",
	                LocalDate.of(2024, 5, 12))
	);
	ServiceEnrollment serviceEnrollment=new ServiceEnrollment(list);
	
	System.out.println(serviceEnrollment.count());
	serviceEnrollment.filterCourseCategory("Computer Science").forEach(System.out::println);
	System.out.println();
	serviceEnrollment.filterCourse("Java").forEach(System.out::println);
	serviceEnrollment.groupByEnrollment()
    .forEach((k, v) -> {
        System.out.println("Course: " + k);
        v.forEach(System.out::println);
    });

	serviceEnrollment.sortAndDisplay().forEach(System.out::println);;
	


}
}
