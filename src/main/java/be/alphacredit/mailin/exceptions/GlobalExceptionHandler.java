package be.alphacredit.mailin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidCombinationEntityOfferNumberException.class)
    public ResponseEntity<?> invalidCombinationEntityAndOfferNumberException(InvalidCombinationEntityOfferNumberException ex) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .code(ex.getErrorCode())
                .message(ex.getMessage())
                .timestamp(new Date())
                .build();
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(GeneralWSException.class)
    public ResponseEntity<?> generalWSException(GeneralWSException ex) {
        ErrorDetails errorDetails = ErrorDetails.builder()
                .code(ex.getErrorCode())
                .message(ex.getMessage())
                .timestamp(new Date())
                .build();
        return new ResponseEntity<>(errorDetails, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
