package commanderPattern.comanders;

import commanderPattern.domain.Lamp;
import commanderPattern.interfaces.Commands;

public class LampTurnOnCommand implements Commands {


    Lamp lamp;

    @Override
    public void run() {
        lamp.turnOnLight();
    }

    public LampTurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }
}
