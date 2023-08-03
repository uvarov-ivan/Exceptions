// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений


package Homework2.Task3;

import Homework2.View;
import Homework2.Task2.DivisionByZeroException;

public class TestNumbers {
    static View view = new View();

    public static void run(){
        int first = Integer.parseInt(view.prompt("Введите первое число"));
        int second = Integer.parseInt(view.prompt("Введите второе число"));
        int third = Integer.parseInt(view.prompt("Введите третье число"));
        if (first > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона!");
        }else if (second < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона!");
        } else if (first + second < 10) {
            throw new NumberSumException();
        } else if (third == 0){
            throw new DivisionByZeroException();
        }

        System.out.println("Проверка пройдена успешно!");

    }
}
