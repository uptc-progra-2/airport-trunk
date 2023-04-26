package com.example.Flight.plan.Ms;

import java.sql.Date;
import java.util.List;

public class Fly {
    private int pilotId;  
    private int copilotId;
    private List <Routes> listRoutes;
    private int duration;
    private int airplaneId;
    private List<Chair> listChairs;
    private Date dateTime;
    private Durationype durationType;
    private int millas;
    private List<Customer> listCustomer;
    private int costByMillas;
    
    public int getPilotId() {
        return pilotId;
    }
    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }
    public int getCopilotId() {
        return copilotId;
    }
    public void setCopilotId(int copilotId) {
        this.copilotId = copilotId;
    }
    public List<Routes> getListRoutes() {
        return listRoutes;
    }
    public void setListRoutes(List<Routes> listRoutes) {
        this.listRoutes = listRoutes;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getAirplaneId() {
        return airplaneId;
    }
    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }
    public List<Chair> getListChairs() {
        return listChairs;
    }
    public void setListChairs(List<Chair> listChairs) {
        this.listChairs = listChairs;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    public Durationype getDurationType() {
        return durationType;
    }
    public void setDurationType(Durationype durationType) {
        this.durationType = durationType;
    }
    public int getMillas() {
        return millas;
    }
    public void setMillas(int millas) {
        this.millas = millas;
    }
    public List<Customer> getListCustomer() {
        return listCustomer;
    }
    public void setListCustomer(List<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }
    public int getCostByMillas() {
        return costByMillas;
    }
    public void setCostByMillas(int costByMillas) {
        this.costByMillas = costByMillas;
    }
}
