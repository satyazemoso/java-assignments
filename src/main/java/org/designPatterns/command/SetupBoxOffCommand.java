package org.designPatterns.command;

public class SetupBoxOffCommand implements Command{
    private SetupBox setupBox;
    public SetupBoxOffCommand(SetupBox setupBox){
        this.setupBox = setupBox;
    }
    @Override
    public void execute() {
        setupBox.off();
    }
}
