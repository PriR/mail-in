package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.payloads.as400.GetCreditDetailsResponse;
import be.alphacredit.mailin.payloads.rata.NotifyRataResponse;
import be.alphacredit.mailin.payloads.rflow.ResponseRFlow;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
@ComponentScan("be.alphacredit.mailin")
@RequiredArgsConstructor
public class MailInServiceImpl implements MailInService {

    @Autowired
    CreditDetailsService creditDetailsService;

    @Autowired
    NotifyRataService notifyRataService;

    @Override
    public ResponseRFlow response(String entity, String offerNumber, String basket) {
//        GetCreditDetailsResponse getCreditDetailsResponse = creditDetailsService.getCreditDetailsAS400(entity, offerNumber);
        NotifyRataResponse notifyRataResponse = notifyRataService.getEntityAndOfferNumberRata(entity, offerNumber, basket);

        ResponseRFlow response = ResponseRFlow.builder()
                .entity(entity)
                .offerNumber(offerNumber)
                .fileStatus("")
                .worklist("")
                .build();

        return response;
    }
}
