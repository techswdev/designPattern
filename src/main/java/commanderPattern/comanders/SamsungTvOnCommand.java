package commanderPattern.comanders;

import commanderPattern.domain.SamsungTV;
import commanderPattern.interfaces.Commands;

public class SamsungTvOnCommand implements Commands {


    SamsungTV samsungTV;

    @Override
    public void run() {
        samsungTV.turnOnTV();
    }

    public SamsungTvOnCommand(SamsungTV samsungTV) {
        this.samsungTV = samsungTV;
    }
}
