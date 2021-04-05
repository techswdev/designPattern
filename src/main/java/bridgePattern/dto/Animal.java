package Main;

import commanderPattern.comanders.*;
import commanderPattern.domain.Heater;
import commanderPattern.domain.Lamp;
import commanderPattern.domain.OkGoogle;
import commanderPattern.domain.SamsungTV;

public class Animal implements Selectable{

    Eatable eatable;

    public void select(Eatable eatable){
        this.eatable= eatable;
    }

    public void taste(){
        eatable.eat();
    }
}

