package commanderPattern.comanders;

import commanderPattern.domain.Lamp;
import commanderPattern.interfaces.Commands;

public class LampTurnOffCommand implements Commands {


    Lamp lamp;

    public void run() {
        lamp.turnOffLight();
    }

    public LampTurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }
}
