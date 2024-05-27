package transformation;

import experiment.Physics;

public class MainClass {
    public static Material material;

    public static void main(String[] args) {
        Water water = new Water(10);
        Nitro nitro = new Nitro(10);
        Heater heater = new Heater();

//        for (int i = 0; i < 15; i++) {
//            System.out.println(heater.cool(water).);
//            System.out.println();
//
//        }





        // Start with a piece of ice at -5 degrees
        material = new Ice(-5);
        System.out.println(material);

        // Heat it up to +5 degrees
        for (int i = 0; i < 11; i++) { // -5 to +5 requires 11 steps
            heater.heat(material);
            System.out.println(material);
        }

        // Cool it back to -1 degree
        for (int i = 0; i < 6; i++) { // +5 to -1 requires 6 steps
            heater.cool(material);
            System.out.println(material);
        }
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