package be.alphacredit.mailin.payloads.rata;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseRata {

    String offerNumber = "678000002041";
    String entity = "RL";
    String status = "17";
    String worklist = "";

}
