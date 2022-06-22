import entity.Guitare;
import entity.Guitariste;
import entity.Instrument;
import entity.Musicien;
import factory.MusicienFactory;

public class Main {

    /**
     * Dépendance directe de la classe guitare et guitariste
     * fonctionnel, mais lourd et contraignant
     */
    public static void dependanceDirecte(){
        Instrument guitare = new Guitare("folk");
        Musicien musicien = new Guitariste("Guigui", guitare);
        musicien.jouer();
    }

    /**
     * Utilisattion des factory pour injecter les dépendances
     */
    public static void injectionDependance(){
        Musicien guitariste = MusicienFactory.getGuitariste("Guigui");
        guitariste.jouer();
        Musicien pianiste = MusicienFactory.getPianiste("Mozart", "clavecin");
        pianiste.jouer();
        Musicien sonneur = MusicienFactory.getSonneur("Soso");
        sonneur.jouer();
    }



    public static void main(String[] args) {

        System.out.println(" ====== dépendance directe =======");
        dependanceDirecte();
        System.out.println(" ====== Injection de dépendance ======");
        injectionDependance();
    }
}
