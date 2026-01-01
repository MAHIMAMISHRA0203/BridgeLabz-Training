class Course{
    	    String CourseName;
    	    int duration;
    	    int fee;
    	    static String institutionName="GLA University";
    	    Course(int fee, String CourseName,int duration){
    	        this.fee=fee;
    	         this.CourseName=CourseName;
    	          this.duration=duration;
    	    }
    	    void displayCourseDetails(){
    	       
    	        System.out.println("Course details:");
    	        System.out.println(CourseName);
    	        System.out.println(fee);
    	        System.out.println(duration);
    	        

    	    }
    	    void updateInstituteName (String institutionName){
    	        
    	        this.institutionName=institutionName;
    	    }

    
}
public class Courses
{
	public static void main(String[] args) {
	    Course c=new Course(1000,"DSA", 90);
	    c.displayCourseDetails();
	    	    System.out.println(c.institutionName);

	    c.updateInstituteName("Sanskriti");
	    System.out.println(c.institutionName);
	   
	    
	}
}