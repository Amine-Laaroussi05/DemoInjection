package entity;

import factory.InstrumentFactory;

/**
 * Classe Guitariste qui implémente Musicien
 * @author amine
 */
public class Guitariste implements Musicien{


    private String nom;
    private Instrument instrument;



    public Guitariste() {
    }

    public Guitariste(String nom) {
        this.setNom(nom);
        this.instrument = InstrumentFactory.getGuitare();
    }

    public Guitariste(String nom, Instrument instrument) {
        this.nom = nom;
        this.instrument = instrument;
    }

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

    @Override
    public void jouer() {
        System.out.println(this.getNom() + " joue: " + this.getInstrument());
    }
}
