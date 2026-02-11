 **Warehouse Management System (Console-Based Java Application)**

The Warehouse Management System is a console-based Java application designed to manage warehouse operations such as:

* Adding items
* Managing locations
* Adjusting inventory
* Creating pick tasks
* Packing items
* Shipping orders

The project follows a clean layered structure using:

* **Model Layer**
* **Service Layer**
* **Exception Handling**
* **Main (Client Layer)**

---
**Project Architecture**

```
Main (Console UI)
        ↓
WarehouseService (Business Logic)
        ↓
Model Classes (Item, Location, Inventory, etc.)
```

 **Package Structure**

```
com.kce.warehouse
│
├── main
│   └── Main.java
│
├── service
│   └── WarehouseService.java
│
├── model
│   ├── Item.java
│   ├── Location.java
│   ├── InventoryRecord.java
│   ├── PickTask.java
│   ├── PickList.java
│   ├── Pack.java
│   └── Shipment.java
│
└── exception
    └── WarehouseValidationException.java
```
**Core Concepts Used**

* Object-Oriented Programming (OOP)
* Encapsulation
* Constructor-based initialization
* Custom Exception Handling
* Layered Architecture
* Console-based menu-driven system

