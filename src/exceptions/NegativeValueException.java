package exceptions;

public class NegativeValueException extends RuntimeException {
    public NegativeValueException(){
        super("Значение не может быть отрицательным.");
    }
}
