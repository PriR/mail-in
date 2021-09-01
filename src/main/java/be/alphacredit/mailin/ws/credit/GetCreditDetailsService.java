package be.alphacredit.mailin.ws.credit;

import be.alphacredit.mailin.Wws112Input;
import be.alphacredit.mailin.Wws112Result;

public interface GetCreditDetailsService {

    Wws112Result getCreditDetails(Wws112Input input);

}
