/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_calculater;

import java.util.Scanner;


public class BasicCalculator {
        private static double memory = 0;
    private static Scanner readNumber = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            int choice = showMenu();
            switch (choice) {
                case 1:
                    System.out.println("Enter n1 for addition");
                    int n1Add = readNumber.nextInt();
                    System.out.println("Enter n2 for addition");
                    int n2Add = readNumber.nextInt();
                    addNumbers(n1Add, n2Add);
                    break;
                case 2:
                    System.out.println("Enter n1 for subtraction");
                    int n1Subtract = readNumber.nextInt();
                    System.out.println("Enter n2 for subtraction");
                    int n2Subtract = readNumber.nextInt();
                    subtractNumbers(n1Subtract, n2Subtract);
                    break;
                case 3:
                    System.out.println("Enter n1 for multiplication");
                    double n1Multiply = readNumber.nextDouble();
                    System.out.println("Enter n2 for multiplication");
                    double n2Multiply = readNumber.nextDouble();
                    multiplyNumbers(n1Multiply, n2Multiply);
                    break;
                case 4:
                    System.out.println("Enter n1 for division");
                    double n1Divide = readNumber.nextDouble();
                    System.out.println("Enter n2 for division");
                    double n2Divide = readNumber.nextDouble();
                    divideNumbers(n1Divide, n2Divide);
                    break;
                case 5:
                    memoryRecall();
                    break;
                case 6:
                    memoryClear();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

        System.out.println("Thank you, bye!!");
    }

    public static int showMenu() {
        System.out.println("Menu:");
        System.out.println("1- Add");
        System.out.println("2- Subtract");
        System.out.println("3- Multiply");
        System.out.println("4- Divide");
        System.out.println("5- Memory Recall");
        System.out.println("6- Memory Clear");
        System.out.println("7- Quit");
        System.out.println("---------------------");

        int choice = readNumber.nextInt();
        readNumber.nextLine(); // Consume the newline character
        return choice;
    }

    private static void addNumbers(int n1, int n2) {
        int result = n1 + n2;
        memory = result;
        System.out.println("Result: " + result);
    }

    private static void subtractNumbers(int n1, int n2) {
        int result = n1 - n2;
        memory = result;
        System.out.println("Result: " + result);
    }

    private static void multiplyNumbers(double n1, double n2) {
        double result = n1 * n2;
        memory = result;
        System.out.println("Result: " + result);
    }

    private static void divideNumbers(double n1, double n2) {
        if (n2 != 0) {
            double result = n1 / n2;
            memory = result;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero, Please enter a valid number.");
        }
    }

    private static void memoryRecall() {
        System.out.println("Memory Recall: " + memory);
    }

    private static void memoryClear() {
        memory = 0;
        System.out.println("Memory Cleared.");
    }
}