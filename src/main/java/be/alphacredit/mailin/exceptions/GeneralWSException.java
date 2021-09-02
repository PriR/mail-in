package be.alphacredit.mailin.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralWSException extends RuntimeException {

    private Integer errorCode;
    private String message;

    public GeneralWSException() {
        this.setMessage(ErrorCodes.GENERAL_WS_EXCEPTION.getMessage());
        this.setErrorCode(ErrorCodes.GENERAL_WS_EXCEPTION.getCode());
    }

}
