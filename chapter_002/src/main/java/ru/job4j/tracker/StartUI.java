package ru.job4j.tracker;

public class StartUI {
    private static final int ADD = 1;
    private static final int SHOW = 2;
    private static final int EDIT = 3;
    private static final int DEL = 4;
    private static final int FINDID = 5;
    private static final int FINDNAME = 6;
    private static final int EXIT = 7;

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu");
        for (int i = 1; i <= actions.length; i++) {
            System.out.println(i + actions[i].name());
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        tracker.add(new Item(input.askStr("Enter name: ")));
    }

    public static void createAList(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        if (tracker.replace(input.askStr("Enter id selected item:"), new Item(input.askStr("Enter new name:")))) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        if (tracker.delete(input.askStr("Enter id selected item:"))) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        String id = input.askStr("Enter id selected item:");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getId() + " " + item.getName());
        } else {
            System.out.println("item with entered id not found");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        Item[] items = tracker.findByName(input.askStr("Enter name selected item:"));
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new UpdateAction(),
                new DeleteAction(), new CreateAction(),
                new CreateAListAction(), new FindByIdAction(), new FindByNameAction()};
        new StartUI().init(input, tracker, actions);
    }
}
