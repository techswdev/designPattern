package commanderPattern.comanders;

import commanderPattern.domain.SamsungTV;
import commanderPattern.interfaces.Commands;

public class SamsungTvOffCommand implements Commands {


    SamsungTV samsungTV;


    @Override
    public void run() {
        samsungTV.turnOffTV();
    }

    public SamsungTvOffCommand(SamsungTV samsungTV) {
        this.samsungTV = samsungTV;
    }
}
