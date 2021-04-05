package Main;

import commanderPattern.comanders.*;
import commanderPattern.domain.Heater;
import commanderPattern.domain.Lamp;
import commanderPattern.domain.OkGoogle;
import commanderPattern.domain.SamsungTV;

public class Fruit implements Eatable {

    public void eat(){
        System.out.println("Fruit eat");
    }

}

