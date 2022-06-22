package entity;

public class Piano implements Instrument{

    private String model;

    public Piano() {
    }

    public Piano(String model) {
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
        return "Pling Pling Pling";
    }
}
