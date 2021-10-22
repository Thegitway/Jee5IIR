package metier;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;
@XmlRootElement(name = "compte")
public class Compte {
    private Long code;
    private double solde;
    private Date dateCreation;

    public Compte(Long code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    public Compte(){}


}
