package com.uptc.edu.model;

public class Route {
    private String origin;
    private String destination;
    private int durationTimeByHours;
    private int durationTimeByMinutes;
    private int durationTimeBySeconds;

    /**
     * Metodo para mostrar La ciudad de origen de la ruta
     * 
     * @return String con la ciudad de origen
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Metodo para crear La ciudad de origen de la ruta
     * 
     * @param origin String con la ciudad de origen
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Metodo para mostrar La ciudad de destino de la ruta
     * 
     * @return
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Metodo para crear La ciudad de destino de la ruta
     * 
     * @param destination String con la ciudad de destino
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Metodo para mostrar La duracion de la ruta por horas
     * 
     * @return int con la duracion de la ruta en horas
     */
    public int getDurationTimeByHours() {
        return durationTimeByHours;
    }

    /**
     * Metodo para crear La duracion de la ruta por horas
     * 
     * @param durationTime duracion de la ruta en horas
     */
    public void setDurationTimeByHours(int durationTimeByHours) {
        this.durationTimeByHours = durationTimeByHours;
    }

    /**
     * Metodo para mostrar La duracion de la ruta por minutos
     * 
     * @return int con la duracion de la ruta en minutos
     */
    public int getDurationTimeByMinutes() {
        return durationTimeByMinutes;
    }

    /**
     * Metodo para crear La duracion de la ruta por minutos
     * 
     * @param durationTime duracion de la ruta en minutos
     */
    public void setDurationTimeByMinutes(int durationTimeByMinutes) {
        this.durationTimeByMinutes = durationTimeByMinutes;
    }

    /**
     * Metodo para mostrar La duracion de la ruta por segundos
     * 
     * @return int con la duracion de la ruta en segundos
     */
    public int getDurationTimeBySeconds() {
        return durationTimeBySeconds;
    }

    /**
     * Metodo para crear La duracion de la ruta por segundos
     * 
     * @param durationTime duracion de la ruta en segundos
     */
    public void setDurationTimeBySeconds(int durationTimeBySeconds) {
        this.durationTimeBySeconds = durationTimeBySeconds;
    }

    public String CalculateDurationTime(int hours, int minutes, int seconds) {
        return hours + " " + DurationType.HOURS.getName() + ", " + minutes + " " + DurationType.MINUTES.getName() + ", " + seconds
                + " " + DurationType.SECONDS.getName();
    }

    @Override
    public String toString() {
        return "Ruta\nOrigen: " + getOrigin() + "\nDestino: " + getDestination() + "\nTiempo estimado: "
                + CalculateDurationTime(getDurationTimeByHours(), getDurationTimeByMinutes(),
                        getDurationTimeBySeconds());
    }

    public static void main(String[] args) {
        Route route = new Route();
        route.setOrigin("Bogota");
        route.setDestination("Medellin");
        route.setDurationTimeByHours(0);
        route.setDurationTimeByMinutes(10);
        route.setDurationTimeBySeconds(55);
        route.CalculateDurationTime(route.getDurationTimeByHours(), route.getDurationTimeByMinutes(),
        route.getDurationTimeBySeconds());
        System.out.println(route);

    }
}
