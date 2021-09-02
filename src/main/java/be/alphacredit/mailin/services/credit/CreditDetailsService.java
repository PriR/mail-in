package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.payloads.as400.GetCreditDetailsResponse;

public interface CreditDetailsService {
    GetCreditDetailsResponse getCreditDetailsAS400(String entity, String offerNumber);
}
