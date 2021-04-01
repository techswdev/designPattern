package commanderPattern.domain;

import commanderPattern.interfaces.Commands;

public class OkGoogle {

    Commands commands;

    public void setCommands(Commands commands){
        this.commands = commands;
    }

    public void run(){
        commands.run();
    }
}
