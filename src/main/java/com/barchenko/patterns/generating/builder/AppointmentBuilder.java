package com.barchenko.patterns.generating.builder;

import java.util.Date;

public class AppointmentBuilder {
    protected Application application;
    protected int requiredElements;

    public void buildApplication() {
        application = new Application();
    }

    public void buildDates(Date startDate, Date endDate) {
        Date currentDate = new Date();
        if (startDate != null && startDate.after(currentDate)) {
            application.setStartDate(startDate);
        }
        if (endDate != null && endDate.after(currentDate)){
            application.setEndDate(endDate);
        }
    }

    public void buildDescription(String description) {
        application.setDescription(description);
    }

    public Application getApplication() {
        return application;
    }

    @Override
    public String toString() {
        return "AppointmentBuilder{" +
                "application=" + application +
                ", requiredElements=" + requiredElements +
                '}';
    }
}
