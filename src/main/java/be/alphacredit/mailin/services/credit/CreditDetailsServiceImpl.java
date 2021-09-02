package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.Request;
import be.alphacredit.mailin.Wws112Input;
import be.alphacredit.mailin.Wws112Result;
import be.alphacredit.mailin.exceptions.GeneralWSException;
import be.alphacredit.mailin.payloads.as400.GetCreditDetailsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.xml.ws.WebServiceException;
import java.math.BigDecimal;

@Service
@Configuration
@ComponentScan("be.alphacredit.mailin")
@RequiredArgsConstructor
public class CreditDetailsServiceImpl implements CreditDetailsService {

    @Autowired
    be.alphacredit.mailin.ws.credit.GetCreditDetailsServiceImpl getCreditDetailsService;

    @Override
    public GetCreditDetailsResponse getCreditDetailsAS400(String entity, String offerNumber) {

        Wws112Input input = new Wws112Input();
        Request request = new Request();

        request.setEntity(entity);
        request.setOfferNumber(new BigDecimal(offerNumber));

        input.setRequest(request);

        try {
            Wws112Result result = getCreditDetailsService.getCreditDetails(input);
            String error = result.getError().getErrCode();
//            return "".equals(error);
            return new GetCreditDetailsResponse();
        } catch (WebServiceException ex) {
            throw new GeneralWSException();
        } catch (Exception e) {

        }
        return new GetCreditDetailsResponse();
    }
}
