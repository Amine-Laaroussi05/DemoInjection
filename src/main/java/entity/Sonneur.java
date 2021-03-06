package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sonneur implements Musicien{

    private String nom;
    @Autowired
    @Qualifier(value = "cornemuse")
    private Instrument instrument;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Sonneur() {
    }

    public Sonneur(String nom) {
        this.setNom(nom);
    }

    public Sonneur(String nom, Instrument instrument) {
        this.setNom(nom);
        this.setInstrument(instrument);
    }

    public void jouer(){
        System.out.println(this.getNom() + " joue: " + this.getInstrument());
    }
}
