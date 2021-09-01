package be.alphacredit.mailin.payloads.rata;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RequestRata {

    String offerNumber = "678000002041";
    String entity = "RL";
    String callerName = "TEST";
    String basket = "";

}
