package Service;

import jakarta.jws.*;

@WebService
public class CalculatriceWS {
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        // Cette méthode "somme" effectue une addition de deux nombres (a et b)
        return a + b;
    }
}
