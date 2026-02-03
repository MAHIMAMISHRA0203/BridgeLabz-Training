package reflections;

import java.lang.reflect.Method;

public class InvokePrivateMethods {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);
        Object result = method.invoke(calc, 5, 4);

        System.out.println("Result: " + result);
    }
}

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}
