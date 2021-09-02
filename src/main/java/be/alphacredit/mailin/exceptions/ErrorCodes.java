package be.alphacredit.mailin.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodes {

    INVALID_COMBINATION_ENTITY_OFFERNUMBER_EXCEPTION(01, "Invalid combination -> entity: {0}  - offerNumber: {1}"),
    GENERAL_WS_EXCEPTION(99, "General error in Webservice WWS101 !  Error Code PSDS =  + pgm_status");

    private Integer code;
    private String message;

}
