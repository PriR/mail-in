package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.payloads.rflow.ResponseRFlow;

public interface MailInService {

    ResponseRFlow response(String entity, String offerNumber, String basket);
}
