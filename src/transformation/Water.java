package transformation;

public class Water extends Material{

    public Water(){}

    public Water(int temperature) {
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
        return "Water{" +
                "weight=" + getTemperature() +
                '}';
    }
}
