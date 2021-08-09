package com.barchenko.patterns.behavioral.сommand;

public class TvOffCommand implements Command{
    private ElectronicDevice device;

    public TvOffCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
