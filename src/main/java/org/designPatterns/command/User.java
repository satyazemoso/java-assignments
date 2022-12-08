package org.designPatterns.command;

public class User {
    public static void main(String args[]){
        RemoteControl remoteControl = new RemoteControl(); // here remotecontrol is not dependent on either setupbox or tv
        SetupBox setupBox = new SetupBox();
        TV tv = new TV();
        remoteControl.setCommand(new SetupBoxOnCommand(setupBox));
        remoteControl.pressButton();
        remoteControl.setCommand(new SetupBoxOffCommand(setupBox));
        remoteControl.pressButton();
        remoteControl.setCommand(new TVOnCommand(tv));
        remoteControl.pressButton();
        remoteControl.setCommand(new TVOffCommand(tv));
        remoteControl.pressButton();

    }
}
