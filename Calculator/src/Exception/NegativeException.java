package Exception;

public class NegativeException extends RuntimeException{

    @Override
    public String getMessage() {
        
        return super.getMessage() + "результат отрицательный!";
    }


    
}
