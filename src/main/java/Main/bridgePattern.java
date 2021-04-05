package Main;

import commanderPattern.comanders.*;
import commanderPattern.domain.Heater;
import commanderPattern.domain.Lamp;
import commanderPattern.domain.OkGoogle;
import commanderPattern.domain.SamsungTV;

public class bridgePattern {

    public static void main(String[] args) {

        Animal bird  = new Animal();
        bird.select(new Meat());
        bird.taste();

        bird.select(new Fruit());
        bird.taste();

        Human kim  = new Human();
        kim.select(new Meat());
        kim.taste();

        kim.select(new Fruit());
        kim.taste();
    }
}

