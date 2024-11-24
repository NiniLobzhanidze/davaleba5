package org.example;

public class Main {
    public static void main(String[] args) {
        hasTeen(4);
        hasTeen(15);
        hasTeen(27);
    }

    static void hasTeen(int age) {
        if (age >= 13 && age <= 19) {
            System.out.println("True");
            } else {
            System.out.println("False");

            }
        }
    }
