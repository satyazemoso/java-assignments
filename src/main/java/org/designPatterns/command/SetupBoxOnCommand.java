package org.designPatterns.command;

public class SetupBoxOnCommand implements Command{
    private SetupBox setupBox;
    public SetupBoxOnCommand(SetupBox setupBox){
        this.setupBox = setupBox;
    }
    @Override
    public void execute() {
        setupBox.on();
    }
}
