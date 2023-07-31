package Homework2.Task1;

public class InvalidNumberException extends RuntimeException{

    @Override
    public String getMessage() {
        
        return "Некорректное число";
    }

    
}
