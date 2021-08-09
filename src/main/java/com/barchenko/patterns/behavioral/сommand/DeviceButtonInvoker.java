package com.barchenko.patterns.behavioral.сommand;

public class DeviceButtonInvoker {
    private Command command;

    public DeviceButtonInvoker(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
