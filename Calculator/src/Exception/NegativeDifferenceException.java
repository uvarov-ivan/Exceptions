package Exception;

public class NegativeDifferenceException extends RuntimeException{
    
    @Override
    public String getMessage() {
        
        return super.getMessage() + "Уменьшаемое меньше вычитаемого!";
    }
}
