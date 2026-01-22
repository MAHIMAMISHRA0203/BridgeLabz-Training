import java.util.HashMap;
import java.util.Stack;

 class Exam{
	Stack <Integer> st=new Stack<>();
	HashMap<Integer,String >map=new HashMap<>();
	int score;
	int totalQuestions=10;
public void submission(int questionnumber,String answer) {
	scoring();

		st.push(questionnumber);
		map.put(questionnumber, answer);
		System.out.println("Your answer is submitted");
	}
public void display() {
	System.out.println("Your answer and questions are as follows:");
	for(HashMap.Entry<Integer,String> entry : map.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	System.out.println("your score is :"+score+"/100");
}
public int scoring() {
	score=score+10;
	return score;
}

}
public class OnlineExamReview {
	
public static void main(String args[]) {
	Exam exam=new Exam();
	exam.submission(6, "i am the solution of 6th question");

	exam.submission(2, "i am the solution of 2nd question");
	exam.submission(1, "i am the solution of 1st question");
	exam.submission(3, "i am the solution of 3rd question");

	exam.display();
}
}
