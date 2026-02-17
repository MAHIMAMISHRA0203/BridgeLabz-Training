package OnlineCourseEnrollmentManager;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServiceEnrollment {
	List<EnrollmentDetails>list;
	
public ServiceEnrollment(List<EnrollmentDetails> list) {
		super();
		this.list = list;
	}
public List<EnrollmentDetails> filterCourse(String courseName) {
	System.out.println("The filtered Courses are  :");
return	list.stream()
	.filter(e->e.getCourseName().equals(courseName))
	.toList();

}

public List<EnrollmentDetails> filterCourseCategory(String courseCategory) {
return	list.stream()
	.filter(e->e.getCourseName().equals(courseCategory))
	.toList();

}
public Map<String, List<EnrollmentDetails>> groupByEnrollment(){
	System.out.println("The grouped Enrollments are:");
	return list.stream()
			.collect(Collectors.groupingBy(EnrollmentDetails::getCourseName));
}
public Map<String,Long> count() {
	System.out.println("The counts in each department are:");
	return list.stream()
	 .collect(Collectors.groupingBy(EnrollmentDetails::getCourseCategory,Collectors.counting()));

}
public List<EnrollmentDetails> sortAndDisplay() {
	System.out.println("The details are:");
return 	list.stream()
	.sorted(Comparator.comparing(EnrollmentDetails::getEnrollmentDate)).toList();
	
}

}
