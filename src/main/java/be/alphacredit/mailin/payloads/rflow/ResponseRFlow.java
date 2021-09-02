package be.alphacredit.mailin.payloads.rflow;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class ResponseRFlow {

    String offerNumber;
    String entity;
    String fileStatus;
    String worklist;

}
