package com.barchenko.patterns.behavioral.сommand;

public class TvOnCommand implements Command{
    private ElectronicDevice theDevice;

    public TvOnCommand(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
