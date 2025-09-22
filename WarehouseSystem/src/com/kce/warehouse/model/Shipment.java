package com.kce.warehouse.model;

public class Shipment {
    private Pack pack;
    private boolean shipped;

    public Shipment(Pack pack) {
        this.pack = pack;
        this.shipped = false;
    }

    public void closeShipment() {
        if (pack.isPacked()) {
            shipped = true;
            System.out.println("Shipment dispatched!");
        } else {
            System.out.println("Pack not confirmed. Cannot ship.");
        }
    }

    public boolean isShipped() { return shipped; }
}
