package com.kce.warehouse.model;

public class Item {
    private int itemId;
    private String name;

    public Item(int itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public int getItemId() { 
    	return itemId;
    	}
    public String getName() {
    	return name;
    	}

    @Override
    public String toString() {
        return "Item[ID=" + itemId + ", Name=" + name + "]";
    }
}
