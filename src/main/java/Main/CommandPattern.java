package Main;

import commanderPattern.comanders.*;
import commanderPattern.domain.Heater;
import commanderPattern.domain.Lamp;
import commanderPattern.domain.OkGoogle;
import commanderPattern.domain.SamsungTV;

public class CommandPattern {


    public static void main(String[] args) {
        /**
         * device setting
         */
        OkGoogle okGoogle = new OkGoogle();
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        SamsungTV samsungTV = new SamsungTV();


        /**
         * command setting
         */
        HeaterOnCommand heaterOnCommand = new HeaterOnCommand(heater);
        HeaterOffCommand heaterOffCommand = new HeaterOffCommand(heater);

        LampTurnOnCommand lampTurnOnCommand = new LampTurnOnCommand(lamp);
        LampTurnOffCommand lampTurnOffCommand = new LampTurnOffCommand(lamp);

        SamsungTvOnCommand samsungTvOnCommand = new SamsungTvOnCommand(samsungTV);
        SamsungTvOffCommand samsungTvOffCommand = new SamsungTvOffCommand(samsungTV);


        /**
         * command execute
         */

        okGoogle.setCommands(heaterOnCommand);
        okGoogle.run();
        okGoogle.setCommands(heaterOffCommand);
        okGoogle.run();

        okGoogle.setCommands(lampTurnOnCommand);
        okGoogle.run();
        okGoogle.setCommands(lampTurnOffCommand);
        okGoogle.run();

        okGoogle.setCommands(samsungTvOnCommand);
        okGoogle.run();
        okGoogle.setCommands(samsungTvOffCommand);
        okGoogle.run();


    }
}

