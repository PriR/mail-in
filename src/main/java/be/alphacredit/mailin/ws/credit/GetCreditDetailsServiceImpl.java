package be.alphacredit.mailin.ws.credit;

import be.alphacredit.mailin.GetCreditDetailsServices;
import be.alphacredit.mailin.Wws112Input;
import be.alphacredit.mailin.Wws112Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GetCreditDetailsServiceImpl implements GetCreditDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(GetCreditDetailsServiceImpl.class);

    @Resource(name = "getCreditDetailsWS")
    private GetCreditDetailsServices creditDetails;

    @Override
    public Wws112Result getCreditDetails(Wws112Input input) {
        Wws112Result result = creditDetails.wws112(input);
        return result;
    }

}
