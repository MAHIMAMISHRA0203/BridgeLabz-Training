package reflections;

class Student {
    public Student() {
        System.out.println("Student created");
    }
}

public class CreateObject {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Student.class;
        Object obj = cls.getDeclaredConstructor().newInstance();
    }
}
