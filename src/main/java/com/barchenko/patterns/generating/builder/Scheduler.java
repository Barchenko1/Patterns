package com.barchenko.patterns.generating.builder;

import java.util.Date;

public class Scheduler {
    public Application createApplication(AppointmentBuilder builder,Date startDate, Date endDate, String description) {
        if (builder == null) {
            builder = new AppointmentBuilder();
        }
        builder.buildApplication();
        builder.buildDates(startDate, endDate);
        builder.buildDescription(description);
        return builder.getApplication();
    }
}
