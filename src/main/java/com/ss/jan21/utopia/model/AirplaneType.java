package com.ss.jan21.utopia.model;

import java.util.List;

public class AirplaneType {

    int typeId;
    int maxCapacity;
    List<Airplane> airplanes;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public AirplaneType(int typeId, int maxCapacity) {
        super();
        this.typeId = typeId;
        this.maxCapacity = maxCapacity;
    }

}
