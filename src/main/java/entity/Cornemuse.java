package entity;


import org.springframework.stereotype.Component;

@Component
public class Cornemuse implements Instrument{

    private String model;

    public Cornemuse() {
    }

    public Cornemuse(String model) {
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tu tu tu";
    }
}
