package com.company;
import java.util.Scanner;
import java.lang.String;
public class Calc {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        String operation, next;
        boolean isTrue = false;
        System.out.print("This program performs simple mathematical operations" +
                        "\n"+"between two numbers." +
                        "\n"+"Available operations:" +
                        "\n"+"addition `+`" +
                        "\n"+"subtraction `-`" +
                        "\n"+"multiplication `*`" +
                        "\n"+"division - `/`" +
                        "\n"+"To enter an operation, use the operation symbol without quotation marks." +
                        "\n"+"Press Enter key to continue:"
                );

            next = num.nextLine();

            System.out.print("Enter first num: ");
            first = num.nextFloat();
                //System.out.println("Incorrect value." + "\n" + "Try again.");
        do {
            System.out.print("Enter operation: ");
            operation = num.next();

            // Проверяем правильно ли введена операция.
            if (operation.contains("+") ||
                operation.contains("-") ||
                operation.contains("*") ||
                operation.contains("/"))
                isTrue = true;
            else
                System.out.println("A nonexistent operation was entered." + "\n" + "Try again.");
            } while (!isTrue);

        System.out.print("Enter second num: "); //введите второе число
        second = num.nextFloat();

        // Выполнение операции
        switch (operation){
            case "+":
                result = first + second;
                System.out.println("Result is = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result is = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result is = " + result);
                break;
            case "/":
                result = first / second;
                System.out.println("Result is = " + result);
                break;
        }
    }
}
