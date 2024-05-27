package transformation;

public class Ice extends Material {

    public Ice (){}

    public Ice(int temperature) {
        super(temperature);
    }
    @Override
    protected void transform() {
        if (getTemperature() > 0) {
            System.out.println("The ice has melted into water.");
            MainClass.material = new Water(getTemperature());
        }
    }

    @Override
    public String toString() {
        return "Ice{" +
                "weight=" + getTemperature() +
                '}';
    }

}
