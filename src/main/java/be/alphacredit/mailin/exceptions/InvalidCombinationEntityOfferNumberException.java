package be.alphacredit.mailin.exceptions;

public class InvalidCombinationEntityOfferNumberException extends RuntimeException {

    InvalidCombinationEntityOfferNumberException(String entity, String offerNumber) {
        super("Could not combination entity: " + entity + " + offerNumber: " + offerNumber);
    }

}
