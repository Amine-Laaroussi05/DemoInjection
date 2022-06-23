package config;

import entity.Cornemuse;
import entity.Instrument;
import entity.Musicien;
import entity.Sonneur;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Classe de configuration Spring
 * @author amine
 */
@Configuration
public class AppConfigSpring {

    /**
     * Injection de Bean
     * Fabrication d'une instance Cornemuse
     * @return une instance de Cornemuse
     */
    @Bean(name="cornemuse")
    public Instrument getCornemuse(){
        return new Cornemuse();
    }



    /**
     * Bean de fabrication de Sonneur
     * @return une instance de Sonneur
     */
    @Bean(name = "sonneur")
    public Musicien getSonneur(String nom, @Qualifier("cornemuse") Instrument instrument){
//        Injection directe de dépendance
//        return new Sonneur(nom,this.getCornemuse());

//        Injection par bean
        return new Sonneur(nom,instrument);
    }



}
