package com.kce.warehouse.service;

import com.kce.warehouse.model.*;
import java.util.Scanner;

public class WarehouseService {
    private Item item;
    private Location location;
    private InventoryRecord record;
    private PickList pickList;
    private Pack pack;
    private Shipment shipment;

    public void addItem(Scanner sc) {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        item = new Item(id, name);
        System.out.println("Item added: " + item);
    }

    public void addLocation(Scanner sc) {
        System.out.print("Enter Location ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Location Name: ");
        String name = sc.nextLine();
        location = new Location(id, name);
        System.out.println("Location added: " + location);
    }

    public void adjustInventory(Scanner sc) {
        if (item == null || location == null) {
            System.out.println("Add item and location first!");
            return;
        }
        System.out.print("Enter quantity to add: ");
        int qty = sc.nextInt();
        if (record == null) {
            record = new InventoryRecord(item, location, qty);
        } else {
            record.adjustQuantity(qty);
        }
        System.out.println("Inventory updated: " + record);
    }

    public void createPickTask(Scanner sc) {
        if (record == null) {
            System.out.println("No inventory available!");
            return;
        }
        System.out.print("Enter quantity to pick: ");
        int qty = sc.nextInt();
        if (qty > record.getQuantity()) {
            System.out.println("Not enough stock!");
            return;
        }
        record.adjustQuantity(-qty);
        PickTask task = new PickTask(item, location, qty);
        pickList = new PickList();
        pickList.addTask(task);
        System.out.println("Pick task created.");
    }

    public void showPickTask() {
        if (pickList != null) pickList.showSummary();
        else System.out.println("No pick task.");
    }

    public void pack() {
        if (pickList == null) {
            System.out.println("No pick task to pack!");
            return;
        }
        pack = new Pack(pickList.getTask());
        pack.confirmPack();
    }

    public void ship() {
        if (pack == null) {
            System.out.println("No pack available!");
            return;
        }
        shipment = new Shipment(pack);
        shipment.closeShipment();
    }

    public void showInventory() {
        if (record != null) System.out.println("Current Inventory: " + record);
        else System.out.println("No inventory data.");
    }
}
