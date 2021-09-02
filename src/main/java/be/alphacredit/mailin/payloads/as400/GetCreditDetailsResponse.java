package be.alphacredit.mailin.payloads.as400;

public class GetCreditDetailsResponse {

    String entity;
    String offerNumber;
    String statusAccount; // map status using enums.status package
    String worklist;
}
