package be.alphacredit.mailin.payloads.rata;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class NotifyRataResponse {

    String offerNumber;
    String entity;
    String status;
    String worklist;

}
