package com.pb.bulakh.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        System.out.println("Пожалуйста введите первое число:");
        Scanner num1 = new Scanner(System.in);
        operand1 = num1.nextInt();

        System.out.println("Пожалуйста введите второе число:");
        Scanner num2 = new Scanner(System.in);
        operand2 = num1.nextInt();

        System.out.println("Пожалуйста введите знак арифметической операции:");
        Scanner mark = new Scanner(System.in);
        sign = mark.nextLine();

        switch (sign) {
            case ("+"):
                System.out.println("Результат сложения чисел = " + (operand1 + operand2));
                break;
            case ("-"):
                System.out.println("Результат вычитания чисел = " + (operand1 - operand2));
                break;
            case ("*"):
                System.out.println("Результат умножения чисел = " + (operand1 * operand2));
                break;
            case ("/"):
                if (operand2 == 0) {
                    System.out.println("ошибка! невозможно выполненить деление на 0");
                   // или throw new ArithmeticException("ошибка! невозможно выполненить деление на 0");
                }
                System.out.println("Результат деления чисел = " + (operand1 / operand2));
                break;
        }
    }
}
