import java.util.*;

// ===============================
// ABSTRACT COURSE TYPE
// ===============================
abstract class CourseType {

    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    abstract void evaluate();   // how the course is evaluated
}

// ===============================
// DIFFERENT COURSE TYPES
// ===============================
class ExamCourse extends CourseType {

    ExamCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " is evaluated by EXAMS");
    }
}

class AssignmentCourse extends CourseType {

    AssignmentCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " is evaluated by ASSIGNMENTS");
    }
}

class ResearchCourse extends CourseType {

    ResearchCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " is evaluated by RESEARCH WORK");
    }
}

// ===============================
// GENERIC COURSE CLASS
// ===============================
class Course<T extends CourseType> {

    private List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }
}

// ===============================
// UTILITY USING WILDCARDS
// ===============================
class CourseUtil {

    // Wildcard method
    static void showAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.evaluate();   // polymorphism
        }
    }
}

// ===============================
// MAIN CLASS
// ===============================
public class UniversityCourseManagementSystem {

    public static void main(String[] args) {

        // Creating course managers
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding courses
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        assignmentCourses.addCourse(new AssignmentCourse("Web Development"));
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures"));

        researchCourses.addCourse(new ResearchCourse("AI Research"));

        // Displaying all courses dynamically
        System.out.println("📘 UNIVERSITY COURSE EVALUATION SYSTEM");

        CourseUtil.showAllCourses(examCourses.getCourses());
        CourseUtil.showAllCourses(assignmentCourses.getCourses());
        CourseUtil.showAllCourses(researchCourses.getCourses());
    }
}
