package Exception;

public class DivisionByZeroException extends RuntimeException {
    
    @Override
    public String getMessage() {
        
        return super.getMessage() + "Делить на ноль нельзя!";
    }
}
