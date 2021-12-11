package com.company;

import java.util.Scanner;
import java.lang.String;

public class Calc {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first = 0, second = 0, result;
        String operation, next;
        boolean isTrue = true;
        // приветствие
        System.out.print("This program performs simple mathematical operations" +
                "\n" + "between two numbers." +
                "\n" + "Available operations:" +
                "\n" + "addition `+`" +
                "\n" + "subtraction `-`" +
                "\n" + "multiplication `*`" +
                "\n" + "division - `/`" +
                "\n" + "To enter an operation, use the operation symbol without quotation marks." +
                "\n" + "Press Enter key to continue:"
        );

        next = num.nextLine();
        while (!next.contains("exit")) {
            isTrue = true;
            // 1. Ввод первого числа и его проверка
            System.out.print("Enter first num: ");
            while (isTrue) {
                if (num.hasNextFloat()) {
                    first = num.nextFloat();
                    isTrue = false;
                } else {
                    System.out.println("Incorrect value. Try again" + "\n" + "Enter first num: ");
                    isTrue = true;
                    next = num.nextLine();
                }
            }

            // 2. Ввод операции и проверка
            do {
                System.out.print("\n" +"Enter operation: ");
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


            // 3. Ввод второго числа и его проверка
            System.out.print("\n" +"Enter second num: "); //введите второе число

            isTrue = true;
            while (isTrue) {
                if (num.hasNextFloat()) {
                    second = num.nextFloat();
                    isTrue = false;
                } else {
                    System.out.println("Incorrect value. Try again" + "\n" + "\n" + "Enter second num: ");
                    isTrue = true;
                    next = num.nextLine();
                }
            }
            //проверка деления на ноль
            while (second == 0.0 && operation.contains("/")) {
                System.out.print("Result is = Cannot be divided by zero!" + "\n" + "Try again" + "\n" + "Enter second num: ");
                isTrue = true;
                //скопировано из проверки ввода второго числа
                while (isTrue) {
                    if (num.hasNextFloat()) {
                        second = num.nextFloat();
                        isTrue = false;
                    } else {
                        System.out.println("Incorrect value. Try again" + "\n" + "Enter second num: ");
                        isTrue = true;
                        next = num.nextLine();
                    }
                }
                //скопировано из проверки ввода второго числа
            }

            // 4. Выполнение операции
            switch (operation) {
                case "+":
                    result = first + second;
                    System.out.println("\n" + "Result is: "+ "\n" + first + " " + operation + " " + second + " = " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("\n" + "Result is: "+ "\n" + first + " " + operation + " " + second + " = " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("\n" + "Result is: "+ "\n" + first + " " + operation + " " + second + " = " + result);
                    break;
                case "/":
                    result = first / second;
                    System.out.println("\n" + "Result is: "+ "\n" + first + " " + operation + " " + second + " = " + result);
                    break;
            }
            next = num.nextLine();
            System.out.println("\n" +"Press Enter to retry or enter an \"exit\" to complete.");
            next = num.nextLine();
        }
    }
}
