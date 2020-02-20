package ru.job4j.tracker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();
    private final Consumer<String> output;
    private static int work = 0;

    public MenuTracker(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
        this.actions.add(new ShowAll(0, "Show task list"));
        this.actions.add(new CreateItem(1, "New task"));
        this.actions.add(new UpdateItem(2, "Change task info"));
        this.actions.add(new DeleteItem(3, "Delete task"));
        this.actions.add(new FindById(4, "Find task by ID"));
        this.actions.add(new FindByName(5, "Find task by name"));
        this.actions.add(new EndProgram(6, "End program"));
    }

    private void showMenu() {
        output.accept("Menu:");
        for (UserAction action : this.actions) {
            output.accept(action.info());
        }
    }

    public void init() {
        while (this.work == 0) {
            this.showMenu();
            int select = input.askInt("Select:", actions.size());
            this.actions.get(select).execute(input, tracker);
        }
    }

    private class ShowAll extends BaseAction {
        public ShowAll(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                output.accept(String.format("Name: %s | Id: %s",
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
                output.accept("success");
            } else {
                output.accept("false");
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
                output.accept("success");
            } else {
                output.accept("false");
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
                output.accept(item.getId() + " " + item.getName());
            } else {
                output.accept("item with entered id not found");
            }
        }
    }
    private class FindByName extends BaseAction {
        public FindByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            List<Item> items = tracker.findByName(input.askStr("Enter name selected item:"));
            for (Item element: items) {
                output.accept(element.getId() + " " + element.getName());
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
