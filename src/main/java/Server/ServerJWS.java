package Server;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServerJWS {
    public static void main(String[] args) {
        // Créez une instance de la classe CalculatriceWS
        CalculatriceWS calculatrice = new CalculatriceWS();

        // Spécifiez l'URL à laquelle vous souhaitez publier le service web
        String url = "http://localhost:8084/";

        // Publiez le service web à l'URL spécifiée
        Endpoint.publish(url, calculatrice);

        // Affichez l'URL du serveur pour indiquer où le service est accessible
        System.out.println("URL du serveur : " + url);
    }
}
