package factory;


import entity.Guitariste;
import entity.Instrument;
import entity.Musicien;
import entity.Sonneur;

/**
 * Classe de factory qui a pour rôle d'instancier des musiciens
 * avec leurs instruments par injection de dépendance
 * @author amine
 */
public class MusicienFactory {

    public static Musicien getGuitariste(String nom){
        return new Guitariste(nom, InstrumentFactory.getGuitare());
    }

    public static Musicien getGuitariste(String nom, String model){
        return new Guitariste(nom, InstrumentFactory.getGuitare(model));
    }

    public static Musicien getPianiste(String nom){
        return new Guitariste(nom, InstrumentFactory.getGuitare());
    }

    public static Musicien getPianiste(String nom, String model){
        return new Guitariste(nom, InstrumentFactory.getGuitare(model));
    }

    public static Musicien getSonneur(String nom){
        return new Sonneur(nom, InstrumentFactory.getCornemuse());
    }

    public static Musicien getSonneur(String nom, String model){
        return new Sonneur(nom, InstrumentFactory.getCornemuse(model));
    }

}
