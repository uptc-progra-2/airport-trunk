package main.java.com.example.Flight.plan.Ms;

public class Airplan {
    private int id;
    private int [][] chairsNumber;
    private String model;
    private AirplaneType airplaneType;
    private int hoursFly;
    private Status status;
    private int flyHours;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int[][] getChairsNumber() {
        return chairsNumber;
    }
    public void setChairsNumber(int[][] chairsNumber) {
        this.chairsNumber = chairsNumber;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public AirplaneType getAirplaneType() {
        return airplaneType;
    }
    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }
    public int getHoursFly() {
        return hoursFly;
    }
    public void setHoursFly(int hoursFly) {
        this.hoursFly = hoursFly;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public int getFlyHours() {
        return flyHours;
    }
    public void setFlyHours(int flyHours) {
        this.flyHours = flyHours;
    }    
}
