
package be.alphacredit.mailin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetCreditDetailsServices", targetNamespace = "http://getcreditdetails.wsbeans.iseries/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetCreditDetailsServices {


    /**
     * 
     * @param arg0
     * @return
     *     returns be.alphacredit.mailin.Wws112Result
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "wws112", targetNamespace = "http://getcreditdetails.wsbeans.iseries/", className = "be.alphacredit.mailin.Wws112")
    @ResponseWrapper(localName = "wws112Response", targetNamespace = "http://getcreditdetails.wsbeans.iseries/", className = "be.alphacredit.mailin.Wws112Response")
    @Action(input = "http://getcreditdetails.wsbeans.iseries/GetCreditDetailsServices/wws112Request", output = "http://getcreditdetails.wsbeans.iseries/GetCreditDetailsServices/wws112Response")
    public Wws112Result wws112(
        @WebParam(name = "arg0", targetNamespace = "")
        Wws112Input arg0);

}
