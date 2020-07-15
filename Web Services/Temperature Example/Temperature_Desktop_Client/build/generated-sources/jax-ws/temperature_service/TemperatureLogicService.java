
package temperature_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Temperature_LogicService", targetNamespace = "http://temperature_service/", wsdlLocation = "http://localhost:1101/temperature_converter?wsdl")
public class TemperatureLogicService
    extends Service
{

    private final static URL TEMPERATURELOGICSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEMPERATURELOGICSERVICE_EXCEPTION;
    private final static QName TEMPERATURELOGICSERVICE_QNAME = new QName("http://temperature_service/", "Temperature_LogicService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1101/temperature_converter?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPERATURELOGICSERVICE_WSDL_LOCATION = url;
        TEMPERATURELOGICSERVICE_EXCEPTION = e;
    }

    public TemperatureLogicService() {
        super(__getWsdlLocation(), TEMPERATURELOGICSERVICE_QNAME);
    }

    public TemperatureLogicService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPERATURELOGICSERVICE_QNAME, features);
    }

    public TemperatureLogicService(URL wsdlLocation) {
        super(wsdlLocation, TEMPERATURELOGICSERVICE_QNAME);
    }

    public TemperatureLogicService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPERATURELOGICSERVICE_QNAME, features);
    }

    public TemperatureLogicService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TemperatureLogicService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TemperatureInterface
     */
    @WebEndpoint(name = "Temperature_LogicPort")
    public TemperatureInterface getTemperatureLogicPort() {
        return super.getPort(new QName("http://temperature_service/", "Temperature_LogicPort"), TemperatureInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TemperatureInterface
     */
    @WebEndpoint(name = "Temperature_LogicPort")
    public TemperatureInterface getTemperatureLogicPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://temperature_service/", "Temperature_LogicPort"), TemperatureInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPERATURELOGICSERVICE_EXCEPTION!= null) {
            throw TEMPERATURELOGICSERVICE_EXCEPTION;
        }
        return TEMPERATURELOGICSERVICE_WSDL_LOCATION;
    }

}
