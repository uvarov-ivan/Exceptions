package Homework2.Task1;

import Homework2.View;

public class PositivNumber {
    static View view = new View();

    public static void run() {
        int num = Integer.parseInt(view.prompt("Введите положительное число"));

        if (num <= 0) {
            throw new InvalidNumberException();
        }
        System.out.println("Число корректно!");
        
    }

    



}
