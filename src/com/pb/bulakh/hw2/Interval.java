package com.pb.bulakh.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int input;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите число в промежутке от 0 до 100:");
        input = inp.nextInt();
        if (input >= 0 & input <= 14) {
            System.out.println("Число в промежутке [0 - 14]");
        } else if (input >= 15 & input <= 35) {
            System.out.println("Число в промежутке [15 - 35]");
        } else if (input >= 36 & input <= 50) {
            System.out.println("Число в промежутке [36 - 50]");
        } else if (input >= 51 & input <= 100) {
            System.out.println("Число в промежутке [51 - 100]");
        } else System.out.println("Введенное вами число, не находится в промежутке от 0 до 100");
    }
}
