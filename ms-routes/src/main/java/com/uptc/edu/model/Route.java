package com.uptc.edu.model;

public class Route {
    private String origin;
    private String destination;
    private DurationType duration;
    private int durationTime;

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
     * Metodo para mostrar La duracion de la ruta (Horas, Minuto o Segundos)
     * 
     * @return String con la duracion de la ruta
     */
    public String getDuration() {
        return duration.getName();
    }

    /**
     * Metodo para crear La duracion de la ruta (Horas, Minuto o Segundos)
     * 
     * @param duration duracion de la ruta
     */
    public void setDuration(DurationType duration) {
        this.duration = duration;
    }

    /**
     * Metodo para mostrar La duracion de la ruta
     * 
     * @return int con la duracion de la ruta
     */
    public int getDurationTime() {
        return durationTime;
    }

    /**
     * Metodo para crear La duracion de la ruta
     * 
     * @param durationTime duracion de la ruta
     */
    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    @Override
    public String toString() {
        return "Ruta\nOrigen: " + getOrigin() + "\nDestino: " + getDestination() + "\nTiempo estimado: "
                + getDurationTime() + " " + getDuration();
    }
}
