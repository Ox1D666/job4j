package ru.job4j.tracker;

public class StartUI {
    private static final int ADD = 1;
    private static final int SHOW = 2;
    private static final int EDIT = 3;
    private static final int DEL = 4;
    private static final int FINDID = 5;
    private static final int FINDNAME = 6;
    private static final int EXIT = 7;

    public static void createItem(Input input, Tracker tracker) {
        tracker.add(new Item(input.askStr("Enter name: ")));
    }
    public static void createAList(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for(int i = 0; i < tracker.getPosition(); i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
    }
    public static void replaceItem(Input input, Tracker tracker) {
        if (tracker.replace(input.askStr("Enter id selected item:"),
                new Item(input.askStr("Enter new name:")))) {
            System.out.println("success");
        } else System.out.println("false");
    }
    public static void deleteItem(Input input, Tracker tracker) {
        if (tracker.delete(input.askStr("Enter id selected item:"))) {
            System.out.println("success");
        } else System.out.println("false");
    }
    public static void findItemById(Input input, Tracker tracker) {
        String id = input.askStr("Enter id selected item:");
        if (id != null) {
            Item item = tracker.findById(id);
            System.out.println(item.getId() + " " + item.getName());
        }
    }
    public static void findItemByName(Input input, Tracker tracker) {
        Item[] items = tracker.findByName(input.askStr("Enter name selected item:"));
        for(int i = 0; i < tracker.getPosition(); i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select:");
            if (select == ADD) {
                StartUI.createItem(input, tracker);
            } else if (select == SHOW) {
                StartUI.createAList(input, tracker);
            } else if (select == EDIT) {
                StartUI.replaceItem(input, tracker);
            } else if (select == DEL) {
                StartUI.deleteItem(input, tracker);
            } else if (select == FINDID) {
                StartUI.findItemById(input, tracker);
            } else if (select == FINDNAME) {
                StartUI.findItemByName(input, tracker);
            } else if (select == EXIT) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu\n0. Add new item\n1. Show all items\n2. Edit item\n" +
                "3. Delete item\n4. Find item by Id\n5. Find item by name\n" +
                "6. Exit Program\n");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
