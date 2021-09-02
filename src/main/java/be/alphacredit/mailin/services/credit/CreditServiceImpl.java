package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.Request;
import be.alphacredit.mailin.Wws112Input;
import be.alphacredit.mailin.Wws112Result;
import be.alphacredit.mailin.exceptions.GeneralWSException;
import be.alphacredit.mailin.exceptions.InvalidCombinationEntityOfferNumberException;
import be.alphacredit.mailin.payloads.rata.RequestRata;
import be.alphacredit.mailin.payloads.rata.ResponseRata;
import be.alphacredit.mailin.ws.credit.GetCreditDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.WebServiceException;
import java.math.BigDecimal;

@Service
@Configuration
@ComponentScan("be.alphacredit.mailin")
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

    @Autowired
    GetCreditDetailsServiceImpl getCreditDetailsService;

    @Autowired
    ResponseRata responseRata;

    @Autowired
    RestTemplate restTemplate;

//    private final String URI_RATA_CHECK = "http://demo1732975.mockable.io/notify-rata/check";
    private final String URI_RATA_CHECK = "http://demo1732975.mockable.io/notify-rata/check/notfound";

    public ResponseRata getEntityAndOfferNumberRata(String entity, String offerNumber){

        RequestRata request = RequestRata.builder()
                .offerNumber(offerNumber)
                .entity(entity)
                .callerName("TEST")
                .basket("")
                .build();

        try {
            ResponseRata responseRata = restTemplate.postForObject(URI_RATA_CHECK, request, ResponseRata.class);
        } catch (HttpClientErrorException e) {
            if (e.getRawStatusCode() == 404) {
                throw new InvalidCombinationEntityOfferNumberException(entity, offerNumber);
            }
        } catch (Exception e) {

        }

        return responseRata;
    }

    @Override
    public Boolean getCreditDetailsAS400(String entity, String offerNumber) {

        Wws112Input input = new Wws112Input();
        Request request = new Request();

        request.setEntity(entity);
        request.setOfferNumber(new BigDecimal(offerNumber));

        input.setRequest(request);

        try {
            Wws112Result result = getCreditDetailsService.getCreditDetails(input);
            String error = result.getError().getErrCode();
            return "".equals(error);
        } catch (WebServiceException ex) {
            throw new GeneralWSException();
        } catch (Exception e) {

        }
        return Boolean.TRUE;
    }
}
