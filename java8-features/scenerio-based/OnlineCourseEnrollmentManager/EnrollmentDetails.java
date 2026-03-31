package OnlineCourseEnrollmentManager;

import java.time.LocalDate;

public class EnrollmentDetails {
private String studentName;
private String courseName;
private String courseCategory;
private LocalDate enrollmentDate;
public String getStudentName() {
	return studentName;
}
public String getCourseName() {
	return courseName;
}
public String getCourseCategory() {
	return courseCategory;
}
public LocalDate getEnrollmentDate() {
	return enrollmentDate;
}
public EnrollmentDetails(String studentName, String courseName, String courseCategory, LocalDate enrollmentDate) {
	super();
	this.studentName = studentName;
	this.courseName = courseName;
	this.courseCategory = courseCategory;
	this.enrollmentDate = enrollmentDate;
}
public String toString() {
    return studentName + " | " + courseName + " | "
            + courseCategory + " | " + enrollmentDate;
}
}
