package experiment;

import transformation.Ice;
import transformation.Water;

public class Physics { // Partern Transformer

    public Water heat(Ice ice) {
        return new Water(ice.getTemperature());
    }
    public Ice cool (Water water){
        return new Ice(water.getTemperature());

    }
}
