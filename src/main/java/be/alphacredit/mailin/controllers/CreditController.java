package be.alphacredit.mailin.controllers;

import be.alphacredit.mailin.payloads.rata.ResponseRata;
import be.alphacredit.mailin.payloads.rflow.Response;
import be.alphacredit.mailin.services.credit.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("mailin/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping
    public Response getCredit(@RequestHeader("entity") String entity, @RequestHeader("offerNumber") String offerNumber) {
        Boolean result = creditService.getCreditDetailsAS400(entity, offerNumber);
//        ResponseRata result = creditService.getEntityAndOfferNumberRata(entity, offerNumber);

        Response response = Response.builder()
                .entity(entity)
                .offerNumber(offerNumber)
                .fileStatus("")
                .worklist("")
                .build();

        return response;
    }
}
