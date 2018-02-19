package com.company;

import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        System.out.println("Introduceti valoarea int:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("Valoarea int convertita in binar este: " +Integer.toBinaryString(i));
        System.out.println("Valoarea int convertita in octal este: " +Integer.toOctalString(i));
        System.out.println("Valoarea int convertita in hexazecimal este: " +Integer.toHexString(i));
    }
}