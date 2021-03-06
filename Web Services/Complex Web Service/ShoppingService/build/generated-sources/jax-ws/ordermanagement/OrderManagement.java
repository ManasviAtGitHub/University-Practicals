
package ordermanagement;

import java.util.List;
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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OrderManagement", targetNamespace = "http://ordermanagement/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OrderManagement {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "orderProduct", targetNamespace = "http://ordermanagement/", className = "ordermanagement.OrderProduct")
    @ResponseWrapper(localName = "orderProductResponse", targetNamespace = "http://ordermanagement/", className = "ordermanagement.OrderProductResponse")
    @Action(input = "http://ordermanagement/OrderManagement/orderProductRequest", output = "http://ordermanagement/OrderManagement/orderProductResponse")
    public List<Object> orderProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Double arg4);

}
