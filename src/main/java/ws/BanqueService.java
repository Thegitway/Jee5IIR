package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = 'BanqueWs')
public class BanqueService{
    @WebMethod()
    public double conversion(@WebParam(name="montant") double mt){
        return mt*10.6;
    }
    @WebMethod()
    public Compte getCompte(@WebParam(name="code") Long code)
    {
        return new Compte(code,Math.random()*9000,new Date());
    }
    @WebMethod()
    public List<Compte> ListeComptes()
    {
        List<Compte> comptes=new ArrayList<>();
        comptes.add(new Compte(1L,Math.random()*9000,new Date()));
        comptes.add(new Compte(1L,Math.random()*9000,new Date()));
        comptes.add(new Compte(1L,Math.random()*9000,new Date()));
     return comptes;
    }
}
