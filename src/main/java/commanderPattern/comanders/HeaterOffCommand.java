package commanderPattern.comanders;

import commanderPattern.domain.Heater;
import commanderPattern.interfaces.Commands;

public class HeaterOffCommand implements Commands {

    Heater heater;

    @Override
    public void run() {
        heater.turnOffHeater();
    }

    public HeaterOffCommand(Heater heater) {
        this.heater = heater;
    }
}
