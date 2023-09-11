package ru.geekbrains.lesson5.models;

import java.util.Date;

public class Reservation {

    private int counter = 10;
    private static int id;

    private final Date date;
    private final String name;

    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
