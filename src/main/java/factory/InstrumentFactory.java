package factory;

import entity.Cornemuse;
import entity.Guitare;
import entity.Instrument;
import entity.Piano;

/**
 * Classe de factory qui a pour rôle d'instancier des instruments
 * ne contient que des fonctions public static
 * @author amine
 */
public class InstrumentFactory {


    /**
     * Méthode de classe (car static) qui instancie une guitare
     * @return une instance de guitare
     */
    public static Instrument getGuitare(){
        return new Guitare();
    }


    /**
     * Méthode de classe (car static) qui instancie une guitare
     * @param model : String le model de guitare a instancié
     * @return une instance de guitare
     */
    public static Instrument getGuitare(String model){
        return new Guitare(model);
    }

    public static Instrument getPiano(){
        return new Piano();
    }

    public static Instrument getPiano(String model){
        return new Piano(model);
    }

    public static Instrument getCornemuse(){
        return new Cornemuse();
    }

    public static Instrument getCornemuse(String model){
        return new Cornemuse(model);
    }
}
