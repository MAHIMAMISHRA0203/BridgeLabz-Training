package OnlineCourseEnrollmentManager;

import java.util.ArrayList;
import java.util.List;

public class DAOEnrollment {
	List<EnrollmentDetails> list=new ArrayList<>();
public void addEnrollment(EnrollmentDetails d) {
	list.add(d);
}
}
