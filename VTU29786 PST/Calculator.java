 import java.util.Scanner;

public class Calculator {


int add(int a, int b) {
    return a + b;
}

int divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("/ by zero");
    }
    return a / b;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] parts = sc.nextLine().trim().split("\\s+");
    int a = Integer.parseInt(parts[0]);
    String operator = parts[1];
    int b = Integer.parseInt(parts[2]);

    Calculator c = new Calculator();

    try {
        if (operator.equals("+")) {
            int result = c.add(a, b);
            System.out.println(result == a + b ? "Test Passed" : "Test Failed");
        } else if (operator.equals("/")) {
            int result = c.divide(a, b);
            System.out.println(result == a / b ? "Test Passed" : "Test Failed");
        } else {
            System.out.println("Invalid operator");
        }
    } catch (ArithmeticException e) {
        System.out.println("Test Passed");
    }

    sc.close();
}


}

