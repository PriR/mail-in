package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.payloads.rata.ResponseRata;

public interface CreditService {

    ResponseRata getEntityAndOfferNumberRata(String entity, String offerNumber);

    Boolean getCreditDetailsAS400(String entity, String offerNumber);

}
