package commanderPattern.comanders;

import commanderPattern.domain.Heater;
import commanderPattern.interfaces.Commands;

public class HeaterOnCommand implements Commands {


    Heater heater;

    @Override
    public void run() {
        heater.turnOnHeater();
    }

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }
}
