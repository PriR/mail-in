package be.alphacredit.mailin.controllers;

import be.alphacredit.mailin.payloads.rflow.ResponseRFlow;
import be.alphacredit.mailin.services.credit.MailInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mailin/credit")
public class CreditController {

    @Autowired
    private MailInService mailInService;

    @GetMapping
    public ResponseRFlow getCredit(@RequestHeader("entity") String entity, @RequestHeader("offerNumber") String offerNumber, @RequestHeader("basket") String basket) {
        return  mailInService.response(entity, offerNumber, basket);
    }
}
