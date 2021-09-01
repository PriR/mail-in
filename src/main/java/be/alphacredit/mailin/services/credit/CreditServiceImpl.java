package be.alphacredit.mailin.services.credit;

import be.alphacredit.mailin.Request;
import be.alphacredit.mailin.Wws112Input;
import be.alphacredit.mailin.Wws112Result;
import be.alphacredit.mailin.payloads.rata.RequestRata;
import be.alphacredit.mailin.payloads.rata.ResponseRata;
import be.alphacredit.mailin.ws.credit.GetCreditDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Configuration
@ComponentScan("be.alphacredit.mailin")
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

//    private WebClient client = WebClient.create("http://localhost:3003");

    @Autowired
    GetCreditDetailsServiceImpl getCreditDetailsService;

    @Autowired
    ResponseRata responseRata;

    @Autowired
    RestTemplate restTemplate;

    private final String URI_USERS = "/notify-rata/check";

    public ResponseRata getEntityAndOfferNumberRata(String entity, String offerNumber){

        RequestRata request = new RequestRata();

        ResponseRata responseRata = restTemplate.postForObject(URI_USERS, request, ResponseRata.class);
//        Mono<String> response = client.get()
//                .uri("/rata/credit").accept(APPLICATION_JSON)
//                .retrieve()
//                .bodyToMono(ResponseRata.class)
//                .map(ResponseRata::getResponse);
//
//        responseRata.setResponse(response.block());


        return responseRata;
    }

    @Override
    public Boolean getCreditDetailsAS400(String entity, String offerNumber) {

        Wws112Input input = new Wws112Input();
        Request request = new Request();

        request.setEntity(entity);
        request.setOfferNumber(new BigDecimal(offerNumber));

        input.setRequest(request);
        Wws112Result result = getCreditDetailsService.getCreditDetails(input);
        String error = result.getError().getErrCode();
        return "".equals(error);
    }
}
