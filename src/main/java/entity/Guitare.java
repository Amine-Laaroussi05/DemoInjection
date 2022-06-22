package entity;

/**
 * Classe Guitare qui implémente l'interface instrument
 * @author amine
 */
public class Guitare implements Instrument{

    private String model;

    public Guitare() {
    }

    public Guitare(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Guitare{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
