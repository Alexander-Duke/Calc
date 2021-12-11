package com.company.constants;

/**
 * @author Sergei Viacheslaev
 */
public class CalcMessages {
    public static final String EXIT_MESSAGE = "exit";
    public static final String RESULT_MESSAGE = "\nResult is:\n%.2f %s %.2f = %.2f\n";
    public static final String ENTER_FIRST_NUM_MESSAGE = "\nEnter first num: ";
    public static final String ENTER_SECOND_NUM_MESSAGE = "\nEnter second num: ";
    public static final String INCORRECT_SECOND_NUM_MESSAGE = "Incorrect value. Try again\n\n" + ENTER_SECOND_NUM_MESSAGE;
    public static final String INCORRECT_FIRST_NUM_MESSAGE = "Incorrect value. Try again\n\n" + ENTER_FIRST_NUM_MESSAGE;
    public static final String ENTER_OPERATION_MESSAGE = "\nEnter operation: ";
    public static final String NONEXISTING_OPERATION_MESSAGE = "A nonexistent operation was entered.\nTry again.";
    public static final String DEVIDE_BY_ZERO_MESSAGE = "Result is = Cannot be divided by zero!\nTry again Enter second num: ";
    public static final String RETRY_OR_FINISH_MESSAGE = "\nPress Enter to retry or enter an \"exit\" to complete.";
    public static final String WELCOME_MESSAGE = "This program performs simple mathematical operations" +
            "\n" + "between two numbers." +
            "\n" + "Available operations:" +
            "\n" + "addition `+`" +
            "\n" + "subtraction `-`" +
            "\n" + "multiplication `*`" +
            "\n" + "division - `/`" +
            "\n" + "To enter an operation, use the operation symbol without quotation marks.\n";
}
