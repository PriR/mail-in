package be.alphacredit.mailin.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.text.MessageFormat;

@Getter
@Setter
public class InvalidCombinationEntityOfferNumberException extends RuntimeException {

    private Integer errorCode;
    private String message;

    public InvalidCombinationEntityOfferNumberException(String entity, String offerNumber) {
        this.setMessage(MessageFormat.format(ErrorCodes.INVALID_COMBINATION_ENTITY_OFFERNUMBER_EXCEPTION.getMessage(), entity, offerNumber));
        this.setErrorCode(ErrorCodes.INVALID_COMBINATION_ENTITY_OFFERNUMBER_EXCEPTION.getCode());
    }

}
