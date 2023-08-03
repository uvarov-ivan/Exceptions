package Homework2.Task2;

import Homework2.View;

public class Division {
    static View view = new View();

    public static void run(){
        int a = Integer.parseInt(view.prompt("Введите первое число"));
        int b = Integer.parseInt(view.prompt("Введите второе число"));
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        System.out.println("Разделив число " + a + " на " + b + " получаем " + (int)a/b);
    }
}
