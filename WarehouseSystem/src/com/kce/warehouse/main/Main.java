package com.kce.warehouse.main;

import com.kce.warehouse.service.WarehouseService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WarehouseService service = new WarehouseService();

        int choice;
        do {
            System.out.println("\nWarehouse Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Add Location");
            System.out.println("3. Adjust Inventory");
            System.out.println("4. Create Pick Task");
            System.out.println("5. Show Pick Task");
            System.out.println("6. Pack");
            System.out.println("7. Ship");
            System.out.println("8. Show Inventory");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: service.addItem(sc); break;
                case 2: service.addLocation(sc); break;
                case 3: service.adjustInventory(sc); break;
                case 4: service.createPickTask(sc); break;
                case 5: service.showPickTask(); break;
                case 6: service.pack(); break;
                case 7: service.ship(); break;
                case 8: service.showInventory(); break;
                case 9: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 9);

        sc.close();
    }
}
