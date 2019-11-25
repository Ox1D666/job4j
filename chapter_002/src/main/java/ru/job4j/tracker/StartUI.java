package ru.job4j.tracker;



public class StartUI {
    public void init(Input Input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(Input.askStr(""));
            if (select == 0) {
                System.out.println("|Create a new Item|");
                System.out.println("Enter name: ");
                String name = Input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                //private static final int ADD = 1;
                Item[] items = tracker.findAll();
                for(int i = 0; i < tracker.getPosition(); i++) {
                    System.out.println(items[i].getId() + " " + items[i].getName());
                }
            } else if (select == 2) {
                System.out.println("Enter id selected item:");
                String id = Input.askStr("");
                System.out.println("Enter new name:");
                String name = Input.askStr("");
                Item item = new Item(name);
                tracker.replace(id, item);
            } else if (select == 3) {
                System.out.println("Enter id selected item:");
                String id = Input.askStr("");
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("Enter id selected item:");
                String id = Input.askStr("");
                Item item = tracker.findById(id);
                System.out.println(item.getId() + " " + item.getName());
            } else if (select == 5) {
                System.out.println("Enter name selected item:");
                String name = Input.askStr("");
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
        System.out.println("|Menu|\n0. Add new Item\n1. Show all items\n2. Edit item\n" +
                "3. Delete item\n4. Find item by Id\n5. Find item by name\n" +
                "6. Exit Program\nSelect:");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
