
package webWsdl.te;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webWsdl.te package. 
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

    private final static QName _PrintTimeResponse_QNAME = new QName("http://sp/", "printTimeResponse");
    private final static QName _PrintTime_QNAME = new QName("http://sp/", "printTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webWsdl.te
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintTimeResponse }
     * 
     */
    public PrintTimeResponse createPrintTimeResponse() {
        return new PrintTimeResponse();
    }

    /**
     * Create an instance of {@link PrintTime }
     * 
     */
    public PrintTime createPrintTime() {
        return new PrintTime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sp/", name = "printTimeResponse")
    public JAXBElement<PrintTimeResponse> createPrintTimeResponse(PrintTimeResponse value) {
        return new JAXBElement<PrintTimeResponse>(_PrintTimeResponse_QNAME, PrintTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sp/", name = "printTime")
    public JAXBElement<PrintTime> createPrintTime(PrintTime value) {
        return new JAXBElement<PrintTime>(_PrintTime_QNAME, PrintTime.class, null, value);
    }

}
