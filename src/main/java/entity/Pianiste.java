package entity;

import factory.InstrumentFactory;

public class Pianiste implements Musicien{
    private String nom;
    private Instrument instrument;



    public Pianiste() {
    }

    public Pianiste(String nom) {
        this.setNom(nom);
        this.instrument = InstrumentFactory.getPiano();
    }

    public Pianiste(String nom, Instrument instrument) {
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
