
package be.alphacredit.mailin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.alphacredit.mailin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Wws112_QNAME = new QName("http://getcreditdetails.wsbeans.iseries/", "wws112");
    private final static QName _Wws112Response_QNAME = new QName("http://getcreditdetails.wsbeans.iseries/", "wws112Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.alphacredit.mailin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Wws112 }
     * 
     */
    public Wws112 createWws112() {
        return new Wws112();
    }

    /**
     * Create an instance of {@link Wws112Response }
     * 
     */
    public Wws112Response createWws112Response() {
        return new Wws112Response();
    }

    /**
     * Create an instance of {@link Wws112Input }
     * 
     */
    public Wws112Input createWws112Input() {
        return new Wws112Input();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Wws112Result }
     * 
     */
    public Wws112Result createWws112Result() {
        return new Wws112Result();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link Control }
     * 
     */
    public Control createControl() {
        return new Control();
    }

    /**
     * Create an instance of {@link Cosigner }
     * 
     */
    public Cosigner createCosigner() {
        return new Cosigner();
    }

    /**
     * Create an instance of {@link AddressDf }
     * 
     */
    public AddressDf createAddressDf() {
        return new AddressDf();
    }

    /**
     * Create an instance of {@link Debtor }
     * 
     */
    public Debtor createDebtor() {
        return new Debtor();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link SubControlP1 }
     * 
     */
    public SubControlP1 createSubControlP1() {
        return new SubControlP1();
    }

    /**
     * Create an instance of {@link SubControlP2 }
     * 
     */
    public SubControlP2 createSubControlP2() {
        return new SubControlP2();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wws112 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wws112 }{@code >}
     */
    @XmlElementDecl(namespace = "http://getcreditdetails.wsbeans.iseries/", name = "wws112")
    public JAXBElement<Wws112> createWws112(Wws112 value) {
        return new JAXBElement<Wws112>(_Wws112_QNAME, Wws112 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wws112Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Wws112Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://getcreditdetails.wsbeans.iseries/", name = "wws112Response")
    public JAXBElement<Wws112Response> createWws112Response(Wws112Response value) {
        return new JAXBElement<Wws112Response>(_Wws112Response_QNAME, Wws112Response.class, null, value);
    }

}
