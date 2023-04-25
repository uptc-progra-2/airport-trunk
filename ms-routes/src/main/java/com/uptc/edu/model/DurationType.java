package com.uptc.edu.model;

public enum DurationType {
    HOURS("Horas"), MINUTES("Minutos"), SECONDS("Segundos");

    private String name;

    private DurationType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
