package com.example.Flight.plan.Ms;

public class Chair {
    private int row;
    private int column;
    private ChairStatus status;
    private ChairType type;
    private String namePassenger;

    public Chair() {
    }
    public Chair(int row, int column, ChairStatus status, ChairType type, String namePassenger) {
        this.row = row;
        this.column = column;
        this.status = status;
        this.type = type;
        this.namePassenger = namePassenger;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public ChairStatus getStatus() {
        return status;
    }
    public void setStatus(ChairStatus status) {
        this.status = status;
    }
    public ChairType getType() {
        return type;
    }
    public void setType(ChairType type) {
        this.type = type;
    }
    public String getNamePassenger() {
        return namePassenger;
    }
    public void setNamePassenger(String namePassenger) {
        this.namePassenger = namePassenger;
    }
     
}
