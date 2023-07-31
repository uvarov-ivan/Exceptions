package Homework2.Task2;

public class DivisionByZeroException extends RuntimeException {

    @Override
    public String getMessage() {
        
        return ("Деление на ноль недопустимо!");
    }
    
}
