package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.payloads.rata.NotifyRataResponse;

public interface NotifyRataService {

    NotifyRataResponse getEntityAndOfferNumberRata(String entity, String offerNumber, String basket);

}
