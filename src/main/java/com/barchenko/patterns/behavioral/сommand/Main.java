package com.barchenko.patterns.behavioral.сommand;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice device = new Television();
        TvOnCommand onCommand = new TvOnCommand(device);
        DeviceButtonInvoker deviceButtonInvoker1 = new DeviceButtonInvoker(onCommand);
        deviceButtonInvoker1.press();
        //-----------------------------------------------------------
        TvOffCommand offCommand = new TvOffCommand(device);
        DeviceButtonInvoker deviceButtonInvoker2 = new DeviceButtonInvoker(offCommand);
        deviceButtonInvoker2.press();
    }
}
