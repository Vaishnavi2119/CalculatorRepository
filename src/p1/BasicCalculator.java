package p1;

//Java program for a simple calculator
import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
    double num1, num2, result = 0;
    char operator;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    num2 = sc.nextDouble();
    System.out.print("Enter operator (+, -, *, /): ");
    int num3 = 21;
    operator = sc.next().charAt(0);
    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Error! Division by zero.");
                return;
            }
            break;
        default:
            System.out.println("Invalid operator!");
            return;
    }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
}
}