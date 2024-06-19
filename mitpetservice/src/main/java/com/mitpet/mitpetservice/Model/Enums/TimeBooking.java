package com.mitpet.mitpetservice.Model.Enums;

public enum TimeBooking {

    TIME_1("8h30-9h30"),
    TIME_2("9h30-10h30"),
    TIME_3("10h30-11h30"),
    TIME_4("13h30-14h30"),
    TIME_5("14h30-15h30"),
    TIME_6("15h30-16h30"),
    TIME_7("16h30-17h30");

    public final String label;

    private TimeBooking(String label) {
        this.label =label;
    }
}
