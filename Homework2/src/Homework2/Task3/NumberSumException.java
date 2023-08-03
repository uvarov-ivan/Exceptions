package Homework2.Task3;

public class NumberSumException extends RuntimeException{
    
    @Override
    public String getMessage() {
        
        return ("Сумма первого и второго числа слишком мала!");
    }
}
