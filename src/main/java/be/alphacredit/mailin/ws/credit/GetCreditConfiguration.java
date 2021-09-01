package be.alphacredit.mailin.ws.credit;

import be.alphacredit.mailin.GetCreditDetailsServices;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("be.alphacredit.mailin.services")
public class GetCreditConfiguration {

    @Value("${credit.wsdl.url}")
    private String creditWsdlUrl; // as400

    @Bean(name = "getCreditDetailsWS")
    public GetCreditDetailsServices creditDetailsWebServices() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(GetCreditDetailsServices.class);
        jaxWsProxyFactoryBean.setAddress(creditWsdlUrl);
        return (GetCreditDetailsServices) jaxWsProxyFactoryBean.create();
    }
}
