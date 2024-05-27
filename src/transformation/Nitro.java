package transformation;

public class Nitro extends Material{

    public Nitro(){}
    public Nitro(int temperature) {
        super(temperature);
    }

    @Override
    protected void transform() {
        if (getTemperature() <= 0) {
            System.out.println("The water has frozen into ice.");
            MainClass.material = new Ice(getTemperature());
        }
    }
    @Override
    public String toString() {
        return "Nitro{" +
                "weight=" + getTemperature() +
                '}';
    }

}
