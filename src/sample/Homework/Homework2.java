package sample.Homework;

import java.util.Scanner;

public class Homework2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);

        System.out.println("Ваш конечный результат: " + result);


    }

    public static char getOperation() {
        System.out.println("Введите знаки:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы ошиблись, попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы ошиблись, попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }


    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
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
                result = num1 / num2;
                break;
            default:
                System.out.println("Напишите еще раз.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
