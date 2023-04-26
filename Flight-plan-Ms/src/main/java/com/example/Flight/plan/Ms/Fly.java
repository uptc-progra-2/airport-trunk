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
    private DurationType durationType;
    private int millas;
    private List<Customer> listCustomer;
    private int costByMillas;
    
    public Fly() {
    }
    public Fly(int pilotId, int copilotId, List<Routes> listRoutes, int duration, int airplaneId,
            List<Chair> listChairs, Date dateTime, DurationType durationType, int millas, List<Customer> listCustomer,
            int costByMillas) {
        this.pilotId = pilotId;
        this.copilotId = copilotId;
        this.listRoutes = listRoutes;
        this.duration = duration;
        this.airplaneId = airplaneId;
        this.listChairs = listChairs;
        this.dateTime = dateTime;
        this.durationType = durationType;
        this.millas = millas;
        this.listCustomer = listCustomer;
        this.costByMillas = costByMillas;
    }
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
    public DurationType getDurationType() {
        return durationType;
    }
    public void setDurationType(DurationType durationType) {
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
