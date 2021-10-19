import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class seveurJws {
    public static void main(String[] args) {
        String url="https://localhost:8080";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deploye sur "+url);
    }
}
