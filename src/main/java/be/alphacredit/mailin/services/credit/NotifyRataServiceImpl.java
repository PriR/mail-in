package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.exceptions.InvalidCombinationEntityOfferNumberException;
import be.alphacredit.mailin.payloads.rata.NotifyRataRequest;
import be.alphacredit.mailin.payloads.rata.NotifyRataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@Configuration
@ComponentScan("be.alphacredit.mailin")
@RequiredArgsConstructor
public class NotifyRataServiceImpl implements NotifyRataService {

    @Autowired
    RestTemplate restTemplate;

        private final String URI_RATA_CHECK = "http://demo1732975.mockable.io/notify-rata/check";
//    private final String URI_RATA_CHECK = "http://demo1732975.mockable.io/notify-rata/check/notfound";


    public NotifyRataResponse getEntityAndOfferNumberRata(String entity, String offerNumber, String basket){

        NotifyRataRequest request = NotifyRataRequest.builder()
                .offerNumber(offerNumber)
                .entity(entity)
                .callerName("TEST")
                .basket(basket)
                .build();

        try {
            NotifyRataResponse responseRata = restTemplate.postForObject(URI_RATA_CHECK, request, NotifyRataResponse.class);
            return responseRata;
        } catch (HttpClientErrorException e) {
            if (e.getRawStatusCode() == 404) {
                throw new InvalidCombinationEntityOfferNumberException(entity, offerNumber);
            }
        } catch (Exception e) {

        }
        return null;
    }
}
