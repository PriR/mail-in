package be.alphacredit.mailin.payloads.rata;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseRata {

    String offerNumber;
    String entity;
    String status;
    String worklist;

}
