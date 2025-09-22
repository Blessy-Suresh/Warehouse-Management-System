package com.kce.warehouse.model;

public class PickList {
    private PickTask task;

    public void addTask(PickTask task) {
        this.task = task;
    }

    public PickTask getTask() { return task; }

    public void showSummary() {
        if (task != null) {
            System.out.println("Pick List: " + task);
        } else {
            System.out.println("No pick task created.");
        }
    }
}
