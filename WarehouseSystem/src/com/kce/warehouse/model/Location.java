package com.kce.warehouse.model;

public class Location {
    private int locationId;
    private String name;

    public Location(int locationId, String name) {
        this.locationId = locationId;
        this.name = name;
    }

    public int getLocationId() { return locationId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Location[ID=" + locationId + ", Name=" + name + "]";
    }
}
