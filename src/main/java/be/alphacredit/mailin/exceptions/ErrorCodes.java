package be.alphacredit.mailin.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCodes {

    INVALID_COMBINATION_ENTITY_OFFERNUMBER(01, "Invalid combination entity/offer number"),
    GENERAL_WS_ERROR(99, "General error in Webservice WWS101 !  Error Code PSDS =  + pgm_status");

    private int code;
    private String message;

}
