package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for(int i = 0; i < tracker.getPosition(); i++) {
                    System.out.println(items[i].getId() + " " + items[i].getName());
                }
            } else if (select == 2) {
                System.out.println("Enter id selected item:");
                String id = scanner.nextLine();
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("Enter id selected item:");
                String id = scanner.nextLine();
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("Enter id selected item:");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                for(int i = 0; i < tracker.getPosition(); i++) {
                    System.out.println(item.getId() + " " + item.getName());
                }
            } else if (select == 5) {
                System.out.println("Enter id selected item:");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for(int i = 0; i < tracker.getPosition(); i++) {
                    System.out.println(items[i].getId() + " " + items[i].getName());
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu\n0. Add new Item\n1. Show all items\n2. Edit item\n" +
                "3. Delete item\n4. Find item by Id\n5. Find item by name\n" +
                "6. Exit Program\nSelect:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
