package com.company.calculator;

import java.util.Scanner;
import java.lang.String;

import static com.company.constants.CalcConstants.EXIT_MESSAGE;
import static com.company.constants.CalcConstants.WELCOME_MESSAGE;

//This is calculator
public class Calc {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float firstNumber = 0, second = 0, result;
        String operation, nextInput;
        boolean isIncorrectInput;

        System.out.print(WELCOME_MESSAGE);

        nextInput = num.nextLine();
        while (!nextInput.contains(EXIT_MESSAGE)) {
            isIncorrectInput = true;
            // 1. Ввод первого числа и его проверка
            System.out.print("Enter first num: ");
            while (isIncorrectInput) {
                if (num.hasNextFloat()) {
                    firstNumber = num.nextFloat();
                    isIncorrectInput = false;
                } else {
                    System.out.println("Incorrect value. Try again" + "\n" + "Enter first num: ");
                    isIncorrectInput = true;
                    nextInput = num.nextLine();
                }
            }

            // 2. Ввод операции и проверка
            do {
                System.out.print("\n" + "Enter operation: ");
                operation = num.next();

                // Проверяем правильно ли введена операция.
                if (operation.contains("+") ||
                        operation.contains("-") ||
                        operation.contains("*") ||
                        operation.contains("/"))
                    isIncorrectInput = true;
                else
                    System.out.println("A nonexistent operation was entered." + "\n" + "Try again.");
            } while (!isIncorrectInput);


            // 3. Ввод второго числа и его проверка
            System.out.print("\n" + "Enter second num: "); //введите второе число

            isIncorrectInput = true;
            while (isIncorrectInput) {
                if (num.hasNextFloat()) {
                    second = num.nextFloat();
                    isIncorrectInput = false;
                } else {
                    System.out.println("Incorrect value. Try again" + "\n" + "\n" + "Enter second num: ");
                    isIncorrectInput = true;
                    nextInput = num.nextLine();
                }
            }
            //проверка деления на ноль
            while (second == 0.0 && operation.contains("/")) {
                System.out.print("Result is = Cannot be divided by zero!" + "\n" + "Try again" + "\n" + "Enter second num: ");
                isIncorrectInput = true;
                //скопировано из проверки ввода второго числа
                while (isIncorrectInput) {
                    if (num.hasNextFloat()) {
                        second = num.nextFloat();
                        isIncorrectInput = false;
                    } else {
                        System.out.println("Incorrect value. Try again" + "\n" + "Enter second num: ");
                        isIncorrectInput = true;
                        nextInput = num.nextLine();
                    }
                }
                //скопировано из проверки ввода второго числа
            }

            // 4. Выполнение операции
            switch (operation) {
                case "+":
                    result = firstNumber + second;
                    System.out.println("\n" + "Result is: " + "\n" + firstNumber + " " + operation + " " + second + " = " + result);
                    break;
                case "-":
                    result = firstNumber - second;
                    System.out.println("\n" + "Result is: " + "\n" + firstNumber + " " + operation + " " + second + " = " + result);
                    break;
                case "*":
                    result = firstNumber * second;
                    System.out.println("\n" + "Result is: " + "\n" + firstNumber + " " + operation + " " + second + " = " + result);
                    break;
                case "/":
                    result = firstNumber / second;
//                    System.out.println("\n" + "Result is: " + "\n" + firstNumber + " " + operation + " " + second + " = " + result);
                    System.out.printf("\nResult is:\n%.2f %s %.2f = %.2f%n", firstNumber, operation, second, result);
                    break;
            }
            nextInput = num.nextLine();
            System.out.println("\n" + "Press Enter to retry or enter an \"exit\" to complete.");
            nextInput = num.nextLine();
        }
    }
}
