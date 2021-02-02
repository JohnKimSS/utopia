package com.ss.jan21.utopia.model;

public class Airplane {

    String airplaneType;
    int airplaneId;
    int typeId;
    int maxCapacity;



    @java.lang.Override
    public java.lang.String toString() {
        return "Airplane{" +
                "airplaneType='" + airplaneType + '\'' +
                ", typeId=" + typeId +
                '}';
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public int getTypeId() {
        return typeId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
