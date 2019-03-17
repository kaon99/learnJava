package company.exception;

public class UniqueLoginException extends Exception {

    public UniqueLoginException(){

    }
public UniqueLoginException(String message) {
        super(message);
}

}
