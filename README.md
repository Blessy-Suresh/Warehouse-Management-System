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

<img width="802" height="757" alt="image" src="https://github.com/user-attachments/assets/08851a8e-cdce-48e1-82bb-96bf56ee4040" />

<img width="815" height="696" alt="image" src="https://github.com/user-attachments/assets/210d976a-9f89-4ec1-9d01-65b8ca17f8b0" />

<img width="717" height="668" alt="image" src="https://github.com/user-attachments/assets/80231442-a5d6-41ad-85b1-f4453bf14b59" />

<img width="808" height="685" alt="image" src="https://github.com/user-attachments/assets/e1f93780-cc9e-446d-b299-d8349c58626e" />


<img width="656" height="357" alt="image" src="https://github.com/user-attachments/assets/b5e16fcc-39c2-4c92-bde8-83b10ccf180c" />





