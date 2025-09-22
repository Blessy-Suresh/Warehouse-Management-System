package com.kce.warehouse.model;

public class Pack {
    private PickTask task;
    private boolean packed;

    public Pack(PickTask task) {
        this.task = task;
        this.packed = false;
    }

    public void confirmPack() {
        packed = true;
        System.out.println("Packed: " + task.getItem().getName());
    }

    public boolean isPacked() { return packed; }
}
