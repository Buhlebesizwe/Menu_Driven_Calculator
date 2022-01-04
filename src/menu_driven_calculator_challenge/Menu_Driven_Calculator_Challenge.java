
package menu_driven_calculator_challenge;

import java.util.Scanner;

public class Menu_Driven_Calculator_Challenge {

    public static void main(String[] args) {
        char operator;
        int num1, num2, results;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        while (!input.hasNextInt()) {
            System.out.print(input.next() + " is not a valid number please enter a valid number: ");
        }
        num1 = input.nextInt();
        System.out.print("Enter operator: ");
        operator = input.next().charAt(0);
        System.out.print("Enter the second number: ");
        while (!input.hasNextInt()) {
            System.out.print(input.next() + " is not a valid number please enter a valid number: ");
        }
        num2 = input.nextInt();

        switch (operator) {
            case '+':
                results = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + results);
                break;
            case '-':
                results = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + results);
                break;
            case '*':
                results = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + results);
                break;
            case '/':
                results = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + results);
                break;
            case '%':
                results = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + results);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
