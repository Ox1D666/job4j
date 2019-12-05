package ru.job4j.tracker;

import javax.swing.*;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];
    private static int work = 0;

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
        actions[0] = new ShowAll(0, "Show task list");
        actions[1] = new CreateItem(1, "New task");
        actions[2] = new UpdateItem(2, "Change task info");
        actions[3] = new DeleteItem(3, "Delete task");
        actions[4] = new FindById(4, "Find task by ID");
        actions[5] = new FindByName(5, "Find task by name");
        actions[6] = new EndProgram(6, "End program");
    }

    private void showMenu() {
        System.out.println("Menu:");
        for (UserAction action : this.actions) {
            System.out.println(action.info());
        }
    }

    public void init() {
        while (this.work == 0) {
            this.showMenu();
            int select = input.askInt("Select:", actions.length);
            this.actions[select].execute(input, tracker);
        }
    }

    private class ShowAll extends BaseAction {
        public ShowAll(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("Name: %s | Id: %s",
                        item.getName(), item.getId()));
            }
        }
    }
    private class CreateItem extends BaseAction {
        public CreateItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.askStr("Enter name:");
            tracker.add(new Item(name));
        }
    }
    private class UpdateItem extends BaseAction {
        public UpdateItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            if (tracker.replace(input.askStr("Enter id selected item:"), new Item(input.askStr("Enter new name")))) {
                System.out.println("success");
            } else {
                System.out.println("false");
            }
        }
    }
    private class DeleteItem extends BaseAction {
        public DeleteItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            if (tracker.delete(input.askStr("Enter id selected item:"))) {
                System.out.println("success");
            } else {
                System.out.println("false");
            }
        }
    }
    private class FindById extends BaseAction {
        public FindById(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.askStr("Enter id selected item:");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item.getId() + " " + item.getName());
            } else {
                System.out.println("item with entered id not found");
            }
        }
    }
    private class FindByName extends BaseAction {
        public FindByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            Item[] items = tracker.findByName(input.askStr("Enter name selected item:"));
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getId() + " " + items[i].getName());
            }
        }
    }
    private class EndProgram extends BaseAction {
        public EndProgram(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            work = 1;
        }
    }
}
