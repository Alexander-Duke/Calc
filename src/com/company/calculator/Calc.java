package com.company.calculator;

import java.util.Scanner;

import static com.company.calculator.operations.NumbersOperation.*;
import static com.company.constants.CalcMessages.*;

public class Calc {
    private final Scanner scanner = new Scanner(System.in);
    private float firstNumber = 0, secondNumber = 0, result;
    private String operation;
    private String usersInput = "";
    private boolean isIncorrectInput;

    public void startCalculator() {
        System.out.print(WELCOME_MESSAGE);

        while (!usersInput.contains(EXIT_MESSAGE)) {
            isIncorrectInput = true;

            System.out.print(ENTER_FIRST_NUM_MESSAGE);
            firstNumberProcessing();

            operationProcessing();

            System.out.print(ENTER_SECOND_NUM_MESSAGE);
            isIncorrectInput = true;
            secondNumberProcessing();

            divideByZeroProcessing();

            processCalculation();
        }
    }

    private void firstNumberProcessing() {
        while (isIncorrectInput) {
            if (scanner.hasNextFloat()) {
                firstNumber = scanner.nextFloat();
                isIncorrectInput = false;
            } else {
                System.out.println(INCORRECT_FIRST_NUM_MESSAGE);
                isIncorrectInput = true;
                scanner.nextLine();
            }
        }
    }

    private void operationProcessing() {
        do {
            System.out.print(ENTER_OPERATION_MESSAGE);
            operation = scanner.next();

            if (operation.contains("+") ||
                    operation.contains("-") ||
                    operation.contains("*") ||
                    operation.contains("/")) {
                isIncorrectInput = true;
            } else {
                System.out.println(NONEXISTING_OPERATION_MESSAGE);
            }

        } while (!isIncorrectInput);
    }

    private void secondNumberProcessing() {
        while (isIncorrectInput) {
            if (scanner.hasNextFloat()) {
                secondNumber = scanner.nextFloat();
                isIncorrectInput = false;
            } else {
                System.out.println(INCORRECT_SECOND_NUM_MESSAGE);
                isIncorrectInput = true;
                scanner.nextLine();
            }
        }
    }

    private void divideByZeroProcessing() {
        while (secondNumber == 0.0 && DIVISION.equals(operation)) {
            System.out.print(DEVIDE_BY_ZERO_MESSAGE);
            isIncorrectInput = true;
            secondNumberProcessing();
        }
    }

    private void processCalculation() {
        switch (operation) {
            case ADDITION:
                result = firstNumber + secondNumber;
                break;
            case SUBTRACTION:
                result = firstNumber - secondNumber;
                break;
            case MULTIPLICATION:
                result = firstNumber * secondNumber;
                break;
            case DIVISION:
                result = firstNumber / secondNumber;
                break;
        }

        System.out.printf(RESULT_MESSAGE, firstNumber, operation, secondNumber, result);
        System.out.println(RETRY_OR_FINISH_MESSAGE);
        usersInput = scanner.nextLine();
        usersInput = scanner.nextLine();
    }
}
