package transformation;

public abstract class Material {
    private int temperature;
    public Material(){}
    public Material(int weight) {
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}

