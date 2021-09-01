package be.alphacredit.mailin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(InvalidCombinationEntityOfferNumberException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String invalidCombinationEntityAndOfferNumber(InvalidCombinationEntityOfferNumberException ex) {
        return ex.getMessage();
    }
}
