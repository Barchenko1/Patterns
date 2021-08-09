package com.barchenko.patterns.generating.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AppointmentBuilder builder = new AppointmentBuilder();
        Scheduler scheduler = new Scheduler();
        Application application = scheduler.createApplication(builder,
                new Date(2021, 2, 2),
                new Date(2021, 9, 9),
                "test");
        System.out.println(application);
    }
}
