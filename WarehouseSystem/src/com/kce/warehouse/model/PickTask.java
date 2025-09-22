package com.kce.warehouse.model;

public class PickTask {
    private Item item;
    private Location location;
    private int quantity;

    public PickTask(Item item, Location location, int quantity) {
        this.item = item;
        this.location = location;
        this.quantity = quantity;
    }

    public Item getItem() {
    	return item; 
    	}
    public Location getLocation() {
    	return location; 
    	}
    public int getQuantity() { 
    	return quantity; 
    	}

    @Override
    public String toString() {
        return "Pick " + quantity + " of " + item.getName() + " from " + location.getName();
    }
}
