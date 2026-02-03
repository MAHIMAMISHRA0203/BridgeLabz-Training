package reflections;

import java.lang.reflect.Field;

public class ModifyPrivateFields {

    public static void main(String[] args) throws Exception {

        Person p = new Person();
        Field field = Person.class.getDeclaredField("age");

        field.setAccessible(true);
        field.set(p, 30);

        System.out.println("Age: " + field.get(p));
    }
}

class Person {
    private int age = 20;
}
