/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ed
 */
@WebService(serviceName = "CalculWS")
public class CalculWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "somme")
    public int somme(@WebParam(name = "val1") int val1, @WebParam(name = "val2") int val2) {
        //TODO write your implementation code here:
        return val1 + val2 ;
    }
}
