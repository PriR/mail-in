package be.alphacredit.mailin.payloads.rata;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotifyRataRequest {

    String offerNumber;
    String entity;
    String callerName;
    String basket;

}
