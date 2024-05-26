package transformation;

import experiment.Physics;

public class MainClass {
    public static void main(String[] args) {
    Heater heater = new Heater();
    Water water = new Water(0);
        //water.setTemperature(0);

        for (int i = 0; i < 100; i++) {
            heater.heat(water);
        }
        System.out.println("Water temperature " + water.getTemperature());







    }
}




//Ice ice = new Ice(500);
//        //System.out.println(ice);
//       // Water water = new Water(6000);
//        //System.out.println(water);
//
//        //Chaining method call/vocation
//        //System.out.println(new Physics(500).heat().cool());
//
//        Physics physics = new Physics();
//        System.out.println(physics.heat(new Ice(500)));
//        System.out.println(physics.cool(new Water(6000)));