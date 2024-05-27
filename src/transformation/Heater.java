package transformation;

public class Heater {
    protected double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void heat(Material material){
        material.setTemperature(material.getTemperature()+1);

    }
    public void cool(Material material){
        material.setTemperature(material.getTemperature()-1);
    }

}
