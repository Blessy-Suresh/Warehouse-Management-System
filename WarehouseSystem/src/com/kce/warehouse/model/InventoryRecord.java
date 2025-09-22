package com.kce.warehouse.model;

public class InventoryRecord {
    private Item item;
    private Location location;
    private int quantity;

    public InventoryRecord(Item item, Location location, int quantity) {
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

    public void adjustQuantity(int change) {
        quantity += change;
    }

    @Override
    public String toString() {
        return item.getName() + " at " + location.getName() + " → Qty: " + quantity;
    }
}
