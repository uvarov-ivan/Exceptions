package Exception;

public class InvalidInputException extends RuntimeException{

    @Override
    public String getMessage() {
        
        return super.getMessage() + "возведение нуля в любую степень невозможно!";
    }
    
}
