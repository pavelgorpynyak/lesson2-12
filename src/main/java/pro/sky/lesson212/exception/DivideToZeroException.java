package pro.sky.lesson212.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideToZeroException extends IllegalArgumentException {
    public DivideToZeroException( String message ) {
        super(message);
    }

    public DivideToZeroException( String message, Throwable cause ) {
        super(message, cause);
    }

    public DivideToZeroException( Throwable cause ) {
        super(cause);
    }

    public DivideToZeroException() {
    }
}
